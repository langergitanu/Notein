package com.aspose.slides;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p077d8.C3038bv;
import com.aspose.slides.internal.p077d8.C3041c6;
import com.aspose.slides.internal.p193iv.C5133k4;
import com.aspose.slides.p559ms.System.C14113y2;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes3.dex */
public final class License implements ILicense {
    public static final String getVersion() {
        return C3038bv.m12789du();
    }

    @Override // com.aspose.slides.ILicense
    public final boolean isLicensed() {
        Presentation presentation = new Presentation();
        try {
            IAutoShape iAutoShapeAddAutoShape = presentation.getSlides().addEmptySlide(presentation.getLayoutSlides().getByType((byte) 11)).getShapes().addAutoShape(5, 10.0f, 10.0f, 200.0f, 100.0f);
            iAutoShapeAddAutoShape.getTextFrame().setText(C14113y2.m67395k4("", 500, 'a'));
            return iAutoShapeAddAutoShape.getTextFrame().getText().length() == 500;
        } finally {
            presentation.dispose();
        }
    }

    @Override // com.aspose.slides.ILicense
    public final void resetLicense() {
        C3038bv.m12795kk();
        C3041c6.m12815kk();
    }

    @Override // com.aspose.slides.ILicense
    public final void setLicense(InputStream inputStream) throws AsposeLicenseException {
        ByteArrayInputStream byteArrayInputStream;
        if (inputStream != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i <= 0) {
                        break;
                    } else {
                        byteArrayOutputStream.write(bArr, 0, i);
                    }
                }
                byteArrayOutputStream.flush();
                byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            } catch (IOException unused) {
                throw new InvalidOperationException("License stream is not available for reading");
            }
        } else {
            byteArrayInputStream = null;
        }
        new C3038bv().m12801k4(byteArrayInputStream);
    }

    @Override // com.aspose.slides.ILicense
    public final void setLicense(String str) throws AsposeLicenseException {
        FileInputStream fileInputStream = null;
        if (str != null) {
            try {
                try {
                    if (!"".equals(str)) {
                        fileInputStream = new FileInputStream(str);
                    }
                } catch (FileNotFoundException unused) {
                    String path = C5133k4.class.getProtectionDomain().getCodeSource().getLocation().getPath();
                    if (path != null) {
                        fileInputStream = new FileInputStream(new File(URLDecoder.decode(path, "UTF-8")).getParentFile().getPath() + File.separator + str);
                    }
                    setLicense(fileInputStream);
                    return;
                }
            } catch (FileNotFoundException unused2) {
                throw new InvalidOperationException("License stream is not available for reading");
            } catch (UnsupportedEncodingException unused3) {
                throw new InvalidOperationException("License stream is not available for reading");
            }
        }
        setLicense(fileInputStream);
    }
}
