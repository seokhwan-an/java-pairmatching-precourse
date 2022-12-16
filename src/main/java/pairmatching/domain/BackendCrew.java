package pairmatching.domain;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BackendCrew {

    private static final String FILE = "src/main/resources/backend-crew.md";

    private List<String> crew = new ArrayList<>();

    //md 파일을 List로 저장하는 기능
    public List<String> createCrewList() {
        File crewNames = new File(FILE);
        try {
            BufferedReader br = new BufferedReader(new FileReader(crewNames));
            String name;
            while ((name = br.readLine()) != null) {
                crew.add(name.trim());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return crew;
    }

}
