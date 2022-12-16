package pairmatching.domain;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class FrontendCrew {

    private static final String FILE = "src/main/resources/frontend-crew.md";
    private List<String> crew;

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
