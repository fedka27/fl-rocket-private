package wash.rocket.xor.rocketwash.model;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.Nullable;
import android.util.Base64;

import java.io.Serializable;

public class NotificationData implements Serializable {
    private String title;
    private String message;
    @Nullable
    private String imageBase64;

    public NotificationData(String title,
                            String message,
                            String imageBase64) {
        this.title = title;
        this.message = message;
        this.imageBase64 = imageBase64;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    public String getImageBase64() {
        return imageBase64;
    }

    @Nullable
    public Bitmap getImage() {
        if (imageBase64 == null) return null;
        byte[] bytes = Base64.decode(imageBase64, Base64.DEFAULT);
        return BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
    }
}
