package volley.polisportivamogliano.it.segnapunti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import volley.polisportivamogliano.it.segnapunti.model.Punteggio;

@Controller
public class PunteggioController {
    private Punteggio punteggio = new Punteggio();

    @GetMapping("/console")
    public String console(Model model) {
        if (punteggio.getTeamAName() == null) {
            punteggio.setTeamAName("Locali");
        }
        if (punteggio.getTeamBName() == null) {
            punteggio.setTeamBName("Ospiti");
        }

        model.addAttribute("punteggio", punteggio);
        return "console";
    }

    @GetMapping("/display")
    public String display(Model model) {
        model.addAttribute("punteggio", punteggio);
        return "display";
    }

    @PostMapping("/console/teamA/addPoint")
    public String addPointToTeamA() {
        int currentScore = punteggio.getTeamAScore();
        punteggio.setTeamAScore(currentScore + 1);
        return "redirect:/console";
    }

    @PostMapping("/console/teamA/removePoint")
    public String removePointToTeamA() {
        int currentScore = punteggio.getTeamAScore();
        if (currentScore > 0) {
            punteggio.setTeamAScore(currentScore - 1);
        }
        return "redirect:/console";
    }


    @PostMapping("/console/teamB/removePoint")
    public String removePointToTeamB() {
        int currentScore = punteggio.getTeamBScore();
        if (currentScore > 0) {
            punteggio.setTeamBScore(currentScore - 1);
        }
        return "redirect:/console";
    }

    @PostMapping("/console/teamB/addPoint")
    public String addPointToTeamB() {
        int currentScore = punteggio.getTeamBScore();
        punteggio.setTeamBScore(currentScore + 1);
        return "redirect:/console";
    }

    @PostMapping("/console/teamA/addSet")
    public String addSetToTeamA() {
        int currentSet = punteggio.getSetA();
        punteggio.setSetA(currentSet + 1);
        return "redirect:/console";
    }

    @PostMapping("/console/teamA/removeSet")
    public String removeSetToTeamA() {
        int currentSet = punteggio.getSetA();
        if(currentSet > 0) {
            punteggio.setSetA(currentSet - 1);
        }
        return "redirect:/console";
    }

    @PostMapping("/console/teamB/removeSet")
    public String removeSetToTeamB() {
        int currentSet = punteggio.getSetB();
        if(currentSet > 0) {
            punteggio.setSetB(currentSet - 1);
        }
        return "redirect:/console";
    }

    @PostMapping("/console/teamB/addSet")
    public String addSetToTeamB() {
        int currentSet = punteggio.getSetB();
        punteggio.setSetB(currentSet + 1);
        return "redirect:/console";
    }
    @PostMapping("/console/teamA/setName")
    public String teamASetName(@RequestParam String nameA) {
        punteggio.setTeamAName(nameA);
        return "redirect:/console";
    }

    @PostMapping("/console/teamB/setName")
    public String teamBSetName(@RequestParam String nameB) {
        punteggio.setTeamBName(nameB);
        return "redirect:/console";
    }


}
