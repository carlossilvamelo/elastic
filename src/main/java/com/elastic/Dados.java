package com.elastic;

import com.elastic.dominio.Produto;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Dados {

    public static void main(String... args){
        try {
            Workbook workbook = Workbook.getWorkbook(new File("C:\\Users\\cmelo\\CARLOS\\workspace\\elastic\\src\\main\\resources\\tabela.xls"));
            Sheet sheet = workbook.getSheet(0);


            List<Produto> produtoList = new ArrayList<Produto>();

            Produto produto = null;
            for(int i = 0; i < sheet.getRows(); i++){
                produto = new Produto();
                Cell col1 = sheet.getCell(0, i);
                Cell col2 = sheet.getCell(1, i);
                Cell col3 = sheet.getCell(2, i);
                Cell col4 = sheet.getCell(3, i);
                Cell col5 = sheet.getCell(4, i);
                produto.setProduto(col1.getContents());
                produto.setAno(col2.getContents());
                produto.setEstado(col3.getContents());
                produto.setRefinaria(col4.getContents());
                produto.setUnidade(col5.getContents());
                produtoList.add(produto);

            }

            for (Produto p : produtoList) {
                System.out.println(p.toJson());
            }



        } catch (IOException e) {
            e.printStackTrace();
        } catch (BiffException e) {
            e.printStackTrace();
        }
    }
}
