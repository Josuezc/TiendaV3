
package com.tienda.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface FirebaseStorageService {

    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);

    //El BuketName es el <id_del_proyecto> + ".appspot.com"
    final String BucketName = "techshop-v1-l-ee5fd";

    //Esta es la ruta básica de este proyecto Techshop
    final String rutaSuperiorStorage = "Tienda";

    //Ubicación donde se encuentra el archivo de configuración Json
    final String rutaJsonFile = "firebase";
    
    //El nombre del archivo Json
    final String archivoJsonFile = "techshop-v1-l-ee5fd-firebase-adminsdk-49o5v-edb6c6adf9.json";
}