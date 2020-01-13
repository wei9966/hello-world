package com.wb.servlet;

import com.wb.dao.Dao;
import com.wb.p.FengMian;
import com.wb.pojo.Var;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@javax.servlet.annotation.WebServlet(name = "CpServlet",urlPatterns = "/cp")
public class CpServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            Var v=new Var();
            req.setCharacterEncoding("utf-8");
            resp.setCharacterEncoding("utf-8");
        String cName = req.getParameter("cName");
        int count = Integer.valueOf(req.getParameter("count"));
        int fmSize = Integer.valueOf(req.getParameter("fmSize"));
        String fSize = req.getParameter("fSize");
        int fmKg = Integer.valueOf(req.getParameter("fmKg"));
        int nxSize = Integer.valueOf(req.getParameter("nxSize"));
        String nSize = req.getParameter("nSize");
        int nxKg = Integer.valueOf(req.getParameter("nxKg"));
        int nxP = Integer.valueOf(req.getParameter("nxP"));
        String fumo = req.getParameter("fumo");
        String jiaozhuang = req.getParameter("jiaozhuang");
        String qmd = req.getParameter("qmd");
        String fPageType = req.getParameter("fPageType");
        String nPageType = req.getParameter("nPageType");
        int other = Integer.valueOf(req.getParameter("other"));
        v.setcName(cName);
        v.setCount(count);
        v.setFmKg(fmKg);
        v.setFmSize(fmSize);
        v.setNxKg(nxKg);
        v.setNxSize(nxSize);
        v.setpCount(nxP);
        v.setFumo(fumo);
        v.setJiaozhuang(jiaozhuang);
        v.setQmd(qmd);
        v.setnSize(nSize);
        v.setfSize(fSize);
        v.setfPageType(fPageType);
        v.setnPageType(nPageType);
        v.setOther(other);
        Dao d=new Dao();
        double result = d.getResult(v);
        req.setAttribute("result",result);
        req.getRequestDispatcher("result.jsp").forward(req,resp);
    }
}
