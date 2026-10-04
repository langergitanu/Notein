package ooOOoOO0;

import com.facebook.imagepipeline.producers.C22306Ooooooo;
import oO0o0O0o.C33599OooOo0O;

/* JADX INFO: renamed from: ooOOoOO0.Oooo0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C35143Oooo0o0 extends AbstractC35114OooO00o {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f126193OooO0o0;

    public C35143Oooo0o0(String source) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(source, "source");
        this.f126193OooO0o0 = source;
    }

    @Override // ooOOoOO0.AbstractC35114OooO00o
    public boolean OooO0OO() {
        int i = this.f126099OooO00o;
        if (i == -1) {
            return false;
        }
        while (true) {
            String str = this.f126193OooO0o0;
            if (i >= str.length()) {
                this.f126099OooO00o = i;
                return false;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f126099OooO00o = i;
                return AbstractC35114OooO00o.OooOo0O(cCharAt);
            }
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        r4.f126099OooO00o = r3.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
    
        return 10;
     */
    @Override // ooOOoOO0.AbstractC35114OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte OooO0o() {
        int i = this.f126099OooO00o;
        while (true) {
            String str = this.f126193OooO0o0;
            if (i == -1 || i >= str.length()) {
                break;
            }
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f126099OooO00o = i2;
                return C22306Ooooooo.OooO0OO(cCharAt);
            }
            i = i2;
        }
    }

    @Override // ooOOoOO0.AbstractC35114OooO00o
    public final String OooO0o0() {
        OooO0oo('\"');
        int i = this.f126099OooO00o;
        String str = this.f126193OooO0o0;
        int iOooo0 = C33599OooOo0O.Oooo0(str, '\"', i, 4);
        if (iOooo0 == -1) {
            OooOO0o();
            OooOOoo((byte) 1, false);
            throw null;
        }
        for (int i2 = i; i2 < iOooo0; i2++) {
            if (str.charAt(i2) == '\\') {
                return OooOO0O(str, this.f126099OooO00o, i2);
            }
        }
        this.f126099OooO00o = iOooo0 + 1;
        String strSubstring = str.substring(i, iOooo0);
        kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring, "substring(...)");
        return strSubstring;
    }

    @Override // ooOOoOO0.AbstractC35114OooO00o
    public void OooO0oo(char c) {
        int i = this.f126099OooO00o;
        if (i == -1) {
            OooOooO(c);
            throw null;
        }
        while (true) {
            String str = this.f126193OooO0o0;
            if (i >= str.length()) {
                this.f126099OooO00o = -1;
                OooOooO(c);
                throw null;
            }
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f126099OooO00o = i2;
                if (cCharAt == c) {
                    return;
                }
                OooOooO(c);
                throw null;
            }
            i = i2;
        }
    }

    @Override // ooOOoOO0.AbstractC35114OooO00o
    public final CharSequence OooOo0() {
        return this.f126193OooO0o0;
    }

    @Override // ooOOoOO0.AbstractC35114OooO00o
    public final String OooOo0o(String keyToMatch, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(keyToMatch, "keyToMatch");
        int i = this.f126099OooO00o;
        try {
            if (OooO0o() != 6) {
                return null;
            }
            if (!kotlin.jvm.internal.OooOOO0.OooO0O0(OooOoO0(z), keyToMatch)) {
                return null;
            }
            this.f126101OooO0OO = null;
            if (OooO0o() != 5) {
                return null;
            }
            return OooOoO0(z);
        } finally {
            this.f126099OooO00o = i;
            this.f126101OooO0OO = null;
        }
    }

    @Override // ooOOoOO0.AbstractC35114OooO00o
    public final int OooOoO(int i) {
        if (i < this.f126193OooO0o0.length()) {
            return i;
        }
        return -1;
    }

    @Override // ooOOoOO0.AbstractC35114OooO00o
    public int OooOoOO() {
        char cCharAt;
        int i = this.f126099OooO00o;
        if (i == -1) {
            return i;
        }
        while (true) {
            String str = this.f126193OooO0o0;
            if (i >= str.length() || !((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i++;
        }
        this.f126099OooO00o = i;
        return i;
    }
}
