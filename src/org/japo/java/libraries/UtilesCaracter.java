package org.japo.java.libraries;

import static org.japo.java.libraries.UtilesEntrada.SCN;

/*
 * Copyright 2018 CicloM.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 *
 * @author CicloM
 */
public class UtilesCaracter {
    
    public static final char leerOpcion (String res,String msgUser, String msgError){
        char dato =' ';
        boolean testOK=true;
        do{
            try{
                System.out.print(msgUser);
                dato = SCN.nextLine().charAt(0);
                if (res.contains(dato+"")){
                    testOK=false;
                }else {
                    System.out.println(msgError);
                }
            } catch (Exception e) {
                System.out.println(msgError);
            }
        }while (testOK);
        return dato;
    }

}