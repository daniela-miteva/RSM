package Task2;

public class DownloadInfo {

    private int Size; // bytes;
    private String OriginalFileName;
    private String FileKey;
    private String DownloadURL;

    public int getSize() {
        return Size;
    }

    public void setSize(int size) {
        Size = size;
    }

    public String getOriginalFileName() {
        return OriginalFileName;
    }

    public void setOriginalFileName(String originalFileName) {
        OriginalFileName = originalFileName;
    }

    public String getFileKey() {
        return FileKey;
    }

    public void setFileKey(String fileKey) {
        FileKey = fileKey;
    }

    public String getDownloadURL() {
        return DownloadURL;
    }

    public void setDownloadURL(String downloadURL) {
        DownloadURL = downloadURL;
    }
}
