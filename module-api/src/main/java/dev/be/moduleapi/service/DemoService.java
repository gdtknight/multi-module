package dev.be.moduleapi.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.be.moduleapi.exception.CustomException;
import dev.be.modulecommon.domain.Member;
import dev.be.modulecommon.enums.CodeEnum;
import dev.be.modulecommon.repository.MemberRepository;
import dev.be.modulecommon.service.CommonDemoService;

@Service
public class DemoService {
  private static final Logger logger = LoggerFactory.getLogger(DemoService.class);

  private final CommonDemoService commonDemoService;
  private final MemberRepository memberRepository;

  DemoService(@Autowired CommonDemoService commonDemoService, @Autowired MemberRepository memberRepository) {
    this.commonDemoService = commonDemoService;
    this.memberRepository = memberRepository;
  }

  public String save() {
    memberRepository.save(Member.builder()
        .name(Thread.currentThread().getName())
        .build());
    return "save";
  }

  public String find() {
    int size = memberRepository.findAll().size();
    logger.info("DB Size : " + size);
    return "find";
  }

  public String exception() {
    if (true) {
      throw new CustomException(CodeEnum.UNKNOWN_ERROR);
    }

    return "exception";
  }
}
