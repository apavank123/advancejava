package com.xworkz.pk.controller;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.pk.dto.BevergeDTO;
import com.xworkz.pk.dto.ChatDTO;
import com.xworkz.pk.dto.EducationDTO;
import com.xworkz.pk.dto.FamilyDTO;
import com.xworkz.pk.dto.MobileDTO;

@Component
@RequestMapping("/")
public class PkController {

	public PkController() {
		System.out.println("Created...... " + this.getClass().getSimpleName());
	}

	@GetMapping("/email")
	public String onEmail(Model model) {
		System.out.println("Running the onEmail...");
		model.addAttribute("email", "pk1234@gmail.com");
		return "index.jsp";
	}

	@GetMapping("/adhar")
	public String onAdhar(Model model) {
		System.out.println("Running the onAdhar.......");
		long ref = 786124256521L;
		model.addAttribute("adhar", ref);
		return "index.jsp";
	}

	@GetMapping("/number")
	public String onNumber(Model model) {
		System.out.println("Running the OnNumber.......");
		long num = 9986129467L;
		model.addAttribute("number", num);
		return "index.jsp";
	}

	@GetMapping("/age")
	public String onAge(Model model) {
		System.out.println("Running the onAGE....");
		model.addAttribute("age", 22);
		return "index.jsp";
	}

	@GetMapping("/dateofbirth")
	public String onDateofbirth(Model model) {
		System.out.println("Running the onDateofbirth....");
		model.addAttribute("dateOfBirth", LocalDate.of(2000, 10, 28));
		return "index.jsp";
	}

	@GetMapping("/salary")
	public String onSalary(Model model) {
		System.out.println("Running the onSalary....");
		model.addAttribute("salary", 35000.0);
		return "index.jsp";
	}

	@GetMapping("/friend")
	public String onFriend(Model model) {
		System.out.println("Running the onFriend...");

		List<String> ref = new ArrayList<String>();
		ref.add("Mantu");
		ref.add("deepak");
		ref.add("maruti");
		ref.add("raju");
		ref.add("vivek");
		model.addAttribute("B_friends", ref);
		return "index.jsp";

	}

	@GetMapping("/place")
	public String onPlace(Model model) {
		System.out.println("Running the onPlace...");
		List<String> place = new ArrayList<String>();
		place.add("X-workz");
		place.add("BGK");
		place.add("Mudhol");
		place.add("Goa");
		place.add("Malvan");
		place.add("Dandeli");
		place.add("Mumbai");
		model.addAttribute("visitedPlace", place);
		return "index.jsp";
	}

	@GetMapping("/skill")
	public String onSkillSet(Model model) {
		System.out.println("Running the onSkillSet....");
		List<String> skill = new ArrayList<String>();
		skill.add("Java");
		skill.add("html");
		skill.add("sql");
		skill.add("3dDesign");
		skill.add("Ansys");
		skill.add("CatiaV5");
		model.addAttribute("skills", skill);
		return "index.jsp";
	}

	@GetMapping("educationdto")
	public String onEducationDto(Model model) {
		System.out.println("Running the EducationDTO....");
		EducationDTO edto = new EducationDTO();
		edto.setSchoolName("NPHS");
		edto.setSchoolLocation("Jamakandhi");
		edto.setSchoolTaluk("Jamakandhi");
		edto.setPuClgName("VVPUCollege");
		edto.setPuClgLocation("Mudhol");
		edto.setPuClgTaluk("Mudhol");
		edto.setEngineeringClgName("BGMIT");
		edto.setEngineeringClgLocation("Mudhol");
		edto.setEngineeringBranch("Mechanical");
		edto.setEngineeringTaluk("Mudhol");
		model.addAttribute("educationdto", edto);
		return "index.jsp";
	}

	@GetMapping("family")
	public String onFamily(Model model) {
		System.out.println("Running the FamilyDTO");
		FamilyDTO fam = new FamilyDTO();
		fam.setFatherName("kallappa.S");
		fam.setMotherName("Laxmi.K");
		fam.setBrotherName("Goudesh.K");
		fam.setDistName("Bagalkot");
		fam.setTalukName("Mudhol");
		fam.setVillageName("Malapur");
		fam.setPincodeNum("587313");
		fam.setReligion("Hindu");
		fam.setYearlyIncome("50000");
		fam.setFatherOccupation("Former");
		model.addAttribute("family", fam);
		return "index.jsp";
	}

	@GetMapping("/mobile")
	public String onMobile(Model model) {
		System.out.println("Running the MobileDTO");
		MobileDTO mob = new MobileDTO();
		mob.setModel("OnePlus 2T");
		mob.setCompanyName("OnePlus");
		mob.setRam(6);
		mob.setRom(128);
		mob.setCost(28500);
		model.addAttribute("mobile", mob);
		return "index.jsp";
	}
	
	@GetMapping("drink")
	public String onDrink(Model model) {
		System.out.println("Running the onDrinks..");
		BevergeDTO chill = new BevergeDTO();
		chill.setName("7UP");
		chill.setCold(true);
		chill.setHot(false);
		chill.setPrice(150);
		chill.setLocation("Rajajinagar");
		chill.setDist("Bangalore");
		chill.setTaluk("Bangalore");
		chill.setPlace("Rajajinagar");
		model.addAttribute("drink", chill);
		return "index.jsp";
	}
	@GetMapping("/chat")
	public String chatDetails(Model model) {
		System.out.println("running chatDetails");
		ChatDTO dto = new ChatDTO();
		dto.setId(1);
		dto.setName("Dahi Puri");
		dto.setPrice(80.00);
		dto.setMadeBy("Vivek");
		dto.setLocation("Rajajinagar");
		dto.setQuantity("2 plate");
		dto.setCoolDrinkName("Oreo MilkShake");
		dto.setBuyerName("Raju");
		dto.setTaste(false);
		dto.setCenterName("Vivekanand Chat center");
		dto.setType("Spicy");
		model.addAttribute("chat", dto);
		return "index.jsp";
	}

}
