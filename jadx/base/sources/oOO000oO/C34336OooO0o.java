package oOO000oO;

import com.aspose.words.ControlChar;
import com.huawei.hms.network.embedded.C18101a5;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.security.AccessController;
import java.security.PrivilegedAction;

/* JADX INFO: renamed from: oOO000oO.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34336OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String f123266OooO00o;

    /* JADX INFO: renamed from: oOO000oO.OooO0o$OooO00o */
    public static class OooO00o implements PrivilegedAction<String> {
        @Override // java.security.PrivilegedAction
        public final String run() {
            return System.getProperty(C18101a5.f54156e);
        }
    }

    static {
        try {
            try {
                f123266OooO00o = (String) AccessController.doPrivileged(new OooO00o());
            } catch (Exception unused) {
                f123266OooO00o = String.format("%n", new Object[0]);
            }
        } catch (Exception unused2) {
            f123266OooO00o = IOUtils.LINE_SEPARATOR_UNIX;
        }
    }

    public static String OooO00o(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i != length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return new String(cArr);
    }

    public static String OooO0O0(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('A' <= c && 'Z' >= c) {
                charArray[i] = (char) (c + ControlChar.SPACE_CHAR);
                z = true;
            }
        }
        return z ? new String(charArray) : str;
    }

    public static String OooO0OO(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('a' <= c && 'z' >= c) {
                charArray[i] = (char) (c - ' ');
                z = true;
            }
        }
        return z ? new String(charArray) : str;
    }
}
