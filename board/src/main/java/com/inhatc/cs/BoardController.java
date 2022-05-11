package com.inhatc.cs;
import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.inhatc.domain.BoardVO;
import com.inhatc.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	@Inject
	private BoardService service;
	
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public void registerGet(BoardVO board, Model model)throws Exception{
		System.out.println("Reqeuest register (GET Method)");
	}
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String registerPost(BoardVO board, RedirectAttributes rttr)throws Exception{
		System.out.println("Reqeuest register (POST Method)");
		service.regist(board);
		return "redirect:/board/listAll";
	}
	@RequestMapping(value="/listAll",method = RequestMethod.GET)
	public void listAll(Model model) throws Exception{
		System.out.println("Reqeuest List All");
		model.addAttribute("list",service.listAll());
		
	}		
	@RequestMapping(value="/read", method=RequestMethod.GET)
	public void read(@RequestParam("bno") int bno, Model model) throws Exception{
		model.addAttribute("boardVO", service.read(bno));
	}
	@RequestMapping(value="/remove", method=RequestMethod.POST)
	public String remove(@RequestParam("bno") int bno, RedirectAttributes rttr) throws Exception{
		service.remove(bno);
		return "redirect:/board/listAll";
	}
	  @RequestMapping(value = "/modify", method = RequestMethod.GET)
	  public void modifyGET(int bno, Model model) throws Exception {
	    model.addAttribute(service.read(bno));
	  }

	  @RequestMapping(value = "/modify", method = RequestMethod.POST)
	  public String modifyPOST(BoardVO board, RedirectAttributes rttr) throws Exception {
	    service.modify(board);
	    rttr.addFlashAttribute("msg", "SUCCESS");
	    return "redirect:/board/listAll";
	  }
}
