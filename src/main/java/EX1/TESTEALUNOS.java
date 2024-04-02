/*
 * Copyright (C) 2024 Kayque de Freitas <kayquefreitas08@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package EX1;

/**
 * @author Gustavo Rezende <gustavorezendegabriel@hotmail.com>
 * @author Kayque de Freitas <kayquefreitas08@gmail.com>
 * @data 01/04/2024
 * @brief Class TESTEALUNOS
 */
import EX1.ALUNO;
public class TESTEALUNOS {
    public static void main(String[] args) {
        double SOMA_DE_MEDIDAS = 0;
        int NUMERO_DE_ALUNOS;
        
        ALUNO aluno1 = new ALUNO(6,6,6,6);
        aluno1.setNome("Kayque");
        SOMA_DE_MEDIDAS += 4*aluno1.CalcularMedia();
        System.out.println(aluno1.CalcularMedia());
        
        ALUNO aluno2 = new ALUNO(7,7,7,7);
        aluno2.setNome("Gustavo");
        SOMA_DE_MEDIDAS += 4*aluno2.CalcularMedia();
        System.out.println(aluno2.CalcularMedia());
        
        ALUNO aluno3 = new ALUNO(8.0,8.0,8.0,8.0);
        aluno3.setNome("Gabriel");
        SOMA_DE_MEDIDAS += 4*aluno3.CalcularMedia();
        System.out.println(aluno3.CalcularMedia());
        
        if(aluno1.CalcularMedia()< aluno2.CalcularMedia()){
            System.out.println(aluno1.getNome()+ " -1 "+aluno2.getNome());
            
        }else if(aluno1.CalcularMedia() > aluno2.CalcularMedia()){
            System.out.println(aluno1.getNome()+ " 1 "+aluno2.getNome());
            
        }if(aluno1.CalcularMedia()== aluno2.CalcularMedia()){
            System.out.println(aluno1.getNome()+ " 0 "+aluno2.getNome());
        }
        
        if(aluno2.CalcularMedia()< aluno3.CalcularMedia()){
            System.out.println(aluno2.getNome()+ " -1 "+aluno3.getNome());
            
        }else if(aluno2.CalcularMedia() > aluno3.CalcularMedia()){
            System.out.println(aluno2.getNome()+ " 1 "+aluno3.getNome());
            
        }if(aluno2.CalcularMedia()== aluno3.CalcularMedia()){
            System.out.println(aluno2.getNome()+ " 0 "+aluno3.getNome());
        }
        
        if(aluno3.CalcularMedia()< aluno1.CalcularMedia()){
            System.out.println(aluno3.getNome()+ " -1 "+aluno1.getNome());
            
        }else if(aluno3.CalcularMedia() > aluno1.CalcularMedia()){
            System.out.println(aluno3.getNome()+ " 1 "+aluno1.getNome());
            
        }if(aluno3.CalcularMedia()== aluno1.CalcularMedia()){
            System.out.println(aluno3.getNome()+ " 0 "+aluno1.getNome());
        }
       
        ALUNO aluno4 = new ALUNO();
        
       aluno4.setSOMA_DE_MEDIDAS(SOMA_DE_MEDIDAS);
       aluno4.setNUMERO_DE_ALUNOS(3);
        System.out.println(aluno4.MediaTotal());
    }
}
