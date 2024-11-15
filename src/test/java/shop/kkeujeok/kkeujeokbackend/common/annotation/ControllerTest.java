package shop.kkeujeok.kkeujeokbackend.common.annotation;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.restdocs.RestDocumentationExtension;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import shop.kkeujeok.kkeujeokbackend.auth.api.AuthController;
import shop.kkeujeok.kkeujeokbackend.auth.application.AuthMemberService;
import shop.kkeujeok.kkeujeokbackend.auth.application.AuthService;
import shop.kkeujeok.kkeujeokbackend.auth.application.AuthServiceFactory;
import shop.kkeujeok.kkeujeokbackend.auth.application.TokenService;
import shop.kkeujeok.kkeujeokbackend.block.api.BlockController;
import shop.kkeujeok.kkeujeokbackend.block.application.BlockService;
import shop.kkeujeok.kkeujeokbackend.challenge.api.ChallengeController;
import shop.kkeujeok.kkeujeokbackend.challenge.application.ChallengeService;
import shop.kkeujeok.kkeujeokbackend.dashboard.personal.application.PersonalDashboardService;
import shop.kkeujeok.kkeujeokbackend.dashboard.team.application.TeamDashboardService;
import shop.kkeujeok.kkeujeokbackend.global.aws.S3Service;
import shop.kkeujeok.kkeujeokbackend.global.jwt.TokenProvider;
import shop.kkeujeok.kkeujeokbackend.member.api.MemberControllerTest;
import shop.kkeujeok.kkeujeokbackend.member.follow.application.FollowService;
import shop.kkeujeok.kkeujeokbackend.member.mypage.application.MyPageService;
import shop.kkeujeok.kkeujeokbackend.member.nickname.application.NicknameService;
import shop.kkeujeok.kkeujeokbackend.notification.api.NotificationController;
import shop.kkeujeok.kkeujeokbackend.notification.application.NotificationService;
import shop.kkeujeok.kkeujeokbackend.notification.util.SseEmitterManager;

@AutoConfigureRestDocs
@WebMvcTest({
        BlockController.class,
        AuthController.class,
        ChallengeController.class,
        MemberControllerTest.class,
        NotificationController.class
})
@ExtendWith(RestDocumentationExtension.class)
@ActiveProfiles("test")
public abstract class ControllerTest {

    @Autowired
    protected MockMvc mockMvc;

    @Autowired
    protected ObjectMapper objectMapper;

    @MockBean
    protected BlockService blockService;

    @MockBean
    protected PersonalDashboardService personalDashboardService;

    @MockBean
    protected TeamDashboardService teamDashboardService;

    @MockBean
    protected TokenProvider tokenProvider;

    @MockBean
    protected AuthServiceFactory authServiceFactory;

    @MockBean
    protected AuthMemberService authMemberService;

    @MockBean
    protected TokenService tokenService;

    @MockBean
    protected AuthService authService;

    @MockBean
    protected ChallengeService challengeService;

    @MockBean
    protected NicknameService nicknameService;

    @MockBean
    protected MyPageService myPageService;

    @MockBean
    protected NotificationService notificationService;

    @MockBean
    protected SseEmitterManager sseEmitterManager;

    @MockBean
    S3Service s3Service;

    @MockBean
    protected FollowService followService;
}
