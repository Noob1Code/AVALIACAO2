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

package EX3;

/**
 * @author Gustavo Rezende <gustavorezendegabriel@hotmail.com>
 * @author Kayque de Freitas <kayquefreitas08@gmail.com>
 * @data 01/04/2024
 * @brief Class StocKeeper
 */

// Classe abstrata
public abstract class StocKeeper {
    // Atributo
    private String name;

    // Método Get
    public String getName() {
        return name;
    }

    // Método Set
    public void setName(String name) {
        this.name = name;
    }
    
    // Método
    public void StockKepper(String name){
        
    }
    
    // Método
    public void manageMovie() {
        
    }
    
    // Método
    public void manageAlbum() {
        
    }

}
