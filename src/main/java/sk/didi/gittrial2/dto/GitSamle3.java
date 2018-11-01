package sk.didi.gittrial2.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class GitSamle3 {
    private List<String> hobbies = new ArrayList<>();

    public void print(String desiredHobby){
        System.out.println(desiredHobby);
    }
}
