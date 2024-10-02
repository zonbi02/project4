package group5.webapp.FinalProjectOOP.services;
import org.springframework.web.multipart.MultipartFile;
import java.nio.file.Path;
import java.util.stream.Stream;


public interface UploadFileService {
    String storeFile(MultipartFile file);
    Stream<Path> loadAll(); // load all file inside a folder
    byte[] readFileContent(String fileName);
    void deleteFile(String fileName);
    Boolean isImageFile(MultipartFile file);
}
