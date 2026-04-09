package com.evoting1.evoting_app1;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/vote")
@CrossOrigin(origins = "*")
public class VotingController {

    private Map<String, Candidate> candidates = new HashMap<>();

    public VotingController() {
        candidates.put("A", new Candidate("Candidate A"));
        candidates.put("B", new Candidate("Candidate B"));
        candidates.put("C", new Candidate("Candidate C")); // NEW
    }

    @GetMapping("/candidates")
    public Collection<Candidate> getCandidates() {
        return candidates.values();
    }

    @PostMapping("/{name}")
    public String vote(@PathVariable String name) {
        Candidate c = candidates.get(name);
        if (c != null) {
            c.vote();
            return "Vote recorded successfully for " + name;
        }
        return "Candidate not found";
    }

    @GetMapping("/results")
    public Collection<Candidate> getResults() {
        return candidates.values();
    }

    @PostMapping("/reset")
    public String resetVotes() {
        for (Candidate c : candidates.values()) {
            c.reset();
        }
        return "Votes reset successfully";
    }
}