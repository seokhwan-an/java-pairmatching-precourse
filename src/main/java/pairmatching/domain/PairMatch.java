package pairmatching.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class PairMatch {

    private List<String> backendMatchResult = new ArrayList<>();
    private List<String> frontendMatchResult = new ArrayList<>();

    // 백앤드 크루 매칭
    public List<String> matchBackendCrew(BackendCrew backendCrew) {
        List<String> backendCrewNames = backendCrew.createCrewList();
        List<String> shuffle = Randoms.shuffle(backendCrewNames);
        for(int crew = 0; crew < shuffle.size()-1; crew += 2) {
            String mactch = shuffle.get(crew) + " : " + shuffle.get(crew + 1);
            backendMatchResult.add(mactch);
        }
        if(shuffle.size() % 2 == 1) {
            String threeCrew = backendMatchResult.get(backendMatchResult.size() -1) + " : " + shuffle.get(shuffle.size() -1);
            backendMatchResult.set(backendMatchResult.size()-1, threeCrew);
        }
        return backendMatchResult;
    }

    // 프론트 크루 매칭
    public List<String> matchFrontendCrew(FrontendCrew frontendCrew) {
        List<String> frontendCrewNames = frontendCrew.createCrewList();
        List<String> shuffle = Randoms.shuffle(frontendCrewNames);
        for(int crew = 0; crew < shuffle.size()-1; crew += 2) {
            String mactch = shuffle.get(crew) + " : " + shuffle.get(crew + 1);
            backendMatchResult.add(mactch);
        }
        if(shuffle.size() % 2 == 1) {
            String threeCrew = backendMatchResult.get(backendMatchResult.size() -1) + " : " + shuffle.get(shuffle.size() -1);
            backendMatchResult.set(backendMatchResult.size()-1, threeCrew);
        }
        return backendMatchResult;
    }

    public void init() {
        backendMatchResult.clear();
        frontendMatchResult.clear();
    }

}
