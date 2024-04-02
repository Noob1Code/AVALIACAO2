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
 * @brief Class ALUNO
 */
public class ALUNO {
    private String nome;
    private double N1,N2,N3,N4;
    private int NUMERO_DE_ALUNOS;
    private double SOMA_DE_MEDIDAS;

    public ALUNO() {
    }

    public int getNUMERO_DE_ALUNOS() {
        return NUMERO_DE_ALUNOS;
    }

    public void setNUMERO_DE_ALUNOS(int NUMERO_DE_ALUNOS) {
        this.NUMERO_DE_ALUNOS = NUMERO_DE_ALUNOS;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setSOMA_DE_MEDIDAS(double SOMA_DE_MEDIDAS) {
        this.SOMA_DE_MEDIDAS = SOMA_DE_MEDIDAS;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public ALUNO(double N1, double N2, double N3, double N4) {
        this.N1 = N1;
        this.N2 = N2;
        this.N3 = N3;
        this.N4 = N4;
    }
    
    public double CalcularMedia(){
        return ((N1*1)+(N2*2)+(N3*3)+(N4*4))/4;
    }
    
    
    
    public double MediaTotal(){
               
        return SOMA_DE_MEDIDAS/NUMERO_DE_ALUNOS;
    }
}
