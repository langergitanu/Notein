package oOO00OOo;

import com.aspose.words.ControlChar;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;

/* JADX INFO: renamed from: oOO00OOo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC34352OooO0O0 {
    default boolean OooO(int i) {
        char c;
        if (i == 1) {
            c = '(';
        } else if (i == 2) {
            c = ControlChar.NON_BREAKING_HYPHEN_CHAR;
        } else if (i == 3) {
            c = ControlChar.FIELD_SEPARATOR_CHAR;
        } else if (i == 4) {
            c = '\n';
        } else {
            if (i != 5) {
                throw null;
            }
            c = 0;
        }
        if (c == 0) {
            return OooOO0o();
        }
        if (c == '\n') {
            return OooOO0O();
        }
        if (c == 20) {
            return OooO00o();
        }
        if (c == 30) {
            return OooOO0();
        }
        if (c == '(') {
            return OooO0Oo();
        }
        StringBuilder sb = new StringBuilder("Level [");
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? CloudMetaExtra.DEFINE_NON_PARENT_ID : "TRACE" : "DEBUG" : "INFO" : "WARN" : "ERROR");
        sb.append("] not recognized.");
        throw new IllegalArgumentException(sb.toString());
    }

    boolean OooO00o();

    void OooO0O0(Object obj, String str);

    void OooO0OO(Object obj, String str);

    boolean OooO0Oo();

    void OooO0o(Object obj, String str, Object obj2);

    void OooO0o0(Object obj, String str, Object obj2);

    void OooO0oO(String str);

    void OooO0oo(String str);

    boolean OooOO0();

    boolean OooOO0O();

    boolean OooOO0o();

    void OooOOO(Object obj, String str);

    void OooOOO0(Object obj, String str, Object obj2);

    void OooOOOO(Object obj, String str, Object obj2);

    void OooOOOo(Object obj, String str, Object obj2);

    void OooOOo(String str);

    void OooOOo0(Object obj, String str);

    void OooOOoo(String str);

    void OooOo00(Object obj, String str);

    String getName();
}
