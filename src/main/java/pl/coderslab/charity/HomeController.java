package pl.coderslab.charity;


import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.model.Institution;
import pl.coderslab.repository.DonationRepository;
import pl.coderslab.repository.InstitutionRepository;



import java.util.List;

@Controller
public class HomeController {


    private final InstitutionRepository institutionRepository;
    private final DonationRepository donationRepository;

    public HomeController(InstitutionRepository institutionRepository,
                          DonationRepository donationRepository) {
        this.institutionRepository = institutionRepository;
        this.donationRepository = donationRepository;
    }

    @RequestMapping("/")
    public String homeAction(Model model){
        //all institutions
        List <Institution> institutions = institutionRepository.findAll();
        model.addAttribute("institutions", institutions);
        //
        //sum of donation quantity (each donation has a specific amount of containers)
        List <Long> quantityOfEachDonation = donationRepository.findQuantity();
        long quantity = quantityOfEachDonation.stream().mapToLong(i -> i).sum();
        model.addAttribute("quantity", quantity);
        //
        //sum of all donations
        long allDonations = donationRepository.findAllDonationAmount();
        model.addAttribute("allDonations",allDonations);
        //

        return "index";
    }
}
