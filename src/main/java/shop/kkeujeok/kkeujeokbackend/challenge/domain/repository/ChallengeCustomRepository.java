package shop.kkeujeok.kkeujeokbackend.challenge.domain.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import shop.kkeujeok.kkeujeokbackend.challenge.api.dto.reqeust.ChallengeSearchReqDto;
import shop.kkeujeok.kkeujeokbackend.challenge.domain.Challenge;
import shop.kkeujeok.kkeujeokbackend.member.domain.Member;

public interface ChallengeCustomRepository {
    Page<Challenge> findAllChallenges(Pageable pageable);

    Page<Challenge> findChallengesByMemberInMapping(Member member, Pageable pageable);

    Page<Challenge> findChallengesByCategoryAndKeyword(ChallengeSearchReqDto challengeSearchReqDto, Pageable pageable);
}
