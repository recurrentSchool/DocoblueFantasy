package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.BattleCharacter;
import bean.Boss;
import bean.Weapon;
import model.ContentsBossSelectLogic;
import model.ContentsCharacterSelectLogic;
import model.ContentsWeaponSelectLogic;


/**
 *ContentsServlet
 */
@WebServlet("/ContentsServlet")
public class ContentsServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		ContentsBossSelectLogic cbsl = new ContentsBossSelectLogic();
		ContentsCharacterSelectLogic ccsl = new ContentsCharacterSelectLogic();
		ContentsWeaponSelectLogic cwsl = new ContentsWeaponSelectLogic();

		request.setCharacterEncoding("UTF-8");

		String url = null;
		String bossName = request.getParameter("bossName");
		String charaName = request.getParameter("charaName");
		String weaponName = request.getParameter("weaponName");

		Boss boss;
		BattleCharacter battlechatacter;
		Weapon weapon;

		//Boss情報
		if(bossName.equals("grandOrder"))
		{
			//boss = cbsl.executeSelect("ジ・オーダー・グランデ");

			url = "/boss/boss_grandorder.jsp";//
		}
		else if(bossName == "gurani")
		{
			boss = cbsl.executeSelect("グラニ");
			url = "/boss/boss_gurani.jsp";
		}
		else if(bossName == "medusa")
		{
			boss = cbsl.executeSelect("メドゥーサ");
			url = "/boss/boss_medusa.jsp";
		}
		else if(bossName == "Morrigna")
		{
			boss = cbsl.executeSelect("バイヴカハ");
			url = "/boss/boss_morrigna.jsp";
		}
		else if(bossName == "roseQueen")
		{
			boss = cbsl.executeSelect("ローズクイーン");
			url = "/boss/boss_rosequeen.jsp";
		}
		else if(bossName == "shiva")
		{
			boss = cbsl.executeSelect("シヴァ");
			url = "/boss/boss_shiva.jsp";
		}
		else if(bossName == "tiamatomega")
		{
			boss = cbsl.executeSelect("ティアマトマグナ");
			url = "/boss/boss_tiamatomega.jsp";
		}
		else if(bossName == "ultimatebahamut")
		{
			boss = cbsl.executeSelect("アルティメットバハムート");
			url = "/boss/boss_ultimatebahamut.jsp";
		}


		//Character情報
		if(charaName == "catalina")
		{
			battlechatacter = ccsl.executeSelect("カタリナ");
			url = "/character/character_catalina.jsp";
		}
		else if(charaName == "eugen")
		{
			battlechatacter = ccsl.executeSelect("オイゲン");
			url = "/character/character_eugen.jsp";
		}
		else if(charaName == "lakham")
		{
			battlechatacter = ccsl.executeSelect("ラカム");
			url = "/character/character_lakham.jsp";
		}
		else if(charaName == "lancelot")
		{
			battlechatacter = ccsl.executeSelect("ランスロット");
			url = "/character/character_lancelot.jsp";
		}
		else if(charaName == "limitedio")
		{
			battlechatacter = ccsl.executeSelect("イオ(リミテッド)");
			url = "/character/character_limitedio.jsp";
		}
		else if(charaName == "limitedrosetta")
		{
			battlechatacter = ccsl.executeSelect("ロゼッタ(リミテッド)");
			url = "/character/character_limitedrosetta.jsp";
		}
		else if(charaName == "narumea")
		{
			battlechatacter = ccsl.executeSelect("ナルメア");
			url = "/docobluefantasy/WebContent/character/character_narumea.jsp";
		}
		else if(charaName == "percival")
		{
			battlechatacter = ccsl.executeSelect("パーシヴァル");
			url = "/character/character_percival.jsp";
		}
		else if(charaName == "io")
		{
			battlechatacter = ccsl.executeSelect("イオ");
			url = "/character/chracter_io&rosetta.jsp";
		}


		//Weapon情報
		if(weaponName == "bluesphere")
		{
			weapon = cwsl.executeSelect("ブルースフィア");
			url = "/weapon/weapon_bluesphere.jsp";
		}
		else if(weaponName == "dragonbarv")
		{
			weapon = cwsl.executeSelect("D・ビィ");
			url = "/weapon/weapon_dragonbarv.jsp";
		}
		else if(weaponName == "ixaba")
		{
			weapon = cwsl.executeSelect("イクサバ");
			url = "/weapon/weapon_ixaba.jsp";
		}
		else if(weaponName == "loveeternal")
		{
			weapon = cwsl.executeSelect("エターナル・ラヴ");
			url = "/weapon/weapon_loveeternal.jsp";
		}
		else if(weaponName == "luminieralsordomega")
		{
			weapon = cwsl.executeSelect("シュヴァリエソード・マグナ");
			url = "/weapon/weapon_luminieralsordomega.jsp";
		}
		else if(weaponName == "nibelunghorn")
		{
			weapon = cwsl.executeSelect("ニーベルン・ホルン");
			url = "/weapon/weapon_nibelunghorn.jsp";
		}

	//url = "/weapon/weapon_nibelunghorn.jsp";

		RequestDispatcher dis = request.getRequestDispatcher(url);
		dis.forward(request,response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{

	}

}
