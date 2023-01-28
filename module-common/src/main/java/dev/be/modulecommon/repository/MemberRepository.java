package dev.be.modulecommon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.be.modulecommon.domain.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}
