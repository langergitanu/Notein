package oO0ooO;

import com.aspose.words.internal.C22245OooO0oO;
import java.io.IOException;
import java.util.Enumeration;
import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.AbstractC34039OooOooO;
import oO0oO0Oo.AbstractC34045Oooo0OO;
import oO0oO0Oo.C34027OooOOOo;
import oO0oO0Oo.InterfaceC34019OooO0oO;
import oO0oO0Oo.Oooo0;
import oO0oOo.C34140OooO0o0;

/* JADX INFO: renamed from: oO0ooO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34260OooO0o0 {
    public C34260OooO0o0(byte[] bArr) throws IOException {
        AbstractC34045Oooo0OO abstractC34045Oooo0OO;
        C34027OooOOOo c34027OooOOOo = new C34027OooOOOo(bArr);
        new C34140OooO0o0(c34027OooOOOo.OooOOoo().getEncoded());
        AbstractC34036OooOoOO abstractC34036OooOoOOOooOOoo = c34027OooOOOo.OooOOoo();
        if (abstractC34036OooOoOOOooOOoo != null) {
            Enumeration enumerationOooOo0O = AbstractC34039OooOooO.OooOOoo(abstractC34036OooOoOOOooOOoo.getEncoded()).OooOo0O();
            while (enumerationOooOo0O.hasMoreElements()) {
                Object obj = (InterfaceC34019OooO0oO) enumerationOooOo0O.nextElement();
                if (obj instanceof AbstractC34039OooOooO) {
                    AbstractC34039OooOooO.OooOOoo(obj);
                } else if (obj instanceof Oooo0) {
                    AbstractC34039OooOooO.OooOo00((Oooo0) obj, false);
                } else if (obj instanceof AbstractC34045Oooo0OO) {
                    if (obj == null || obj != null) {
                        abstractC34045Oooo0OO = (AbstractC34045Oooo0OO) obj;
                    } else {
                        AbstractC34036OooOoOO abstractC34036OooOoOO = (AbstractC34036OooOoOO) obj;
                        abstractC34036OooOoOO.getClass();
                        if (abstractC34036OooOoOO instanceof AbstractC34045Oooo0OO) {
                            abstractC34045Oooo0OO = (AbstractC34045Oooo0OO) abstractC34036OooOoOO;
                        } else {
                            if (!(obj instanceof byte[])) {
                                throw new IllegalArgumentException("illegal object in getInstance: ".concat(obj.getClass().getName()));
                            }
                            try {
                                AbstractC34036OooOoOO abstractC34036OooOoOOOooOOO = AbstractC34036OooOoOO.OooOOO((byte[]) obj);
                                if (!AbstractC34045Oooo0OO.class.isInstance(abstractC34036OooOoOOOooOOO)) {
                                    throw new IllegalStateException("unexpected object: ".concat(abstractC34036OooOoOOOooOOO.getClass().getName()));
                                }
                                abstractC34045Oooo0OO = (AbstractC34045Oooo0OO) abstractC34036OooOoOOOooOOO;
                            } catch (Exception e) {
                                throw new IllegalArgumentException(C22245OooO0oO.OooO0Oo(e, new StringBuilder("encoding error in getInstance: ")));
                            }
                        }
                    }
                    abstractC34045Oooo0OO.getString();
                } else {
                    continue;
                }
            }
        }
    }
}
