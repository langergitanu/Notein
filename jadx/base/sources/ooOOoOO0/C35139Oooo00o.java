package ooOOoOO0;

import com.facebook.imagepipeline.producers.C22306Ooooooo;
import java.nio.charset.CharacterCodingException;
import o000oooO.C24755OooO00o;
import oO0o0O0o.C33595OooOOo;

/* JADX INFO: renamed from: ooOOoOO0.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C35139Oooo00o extends AbstractC35114OooO00o {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f126178OooO0o = 128;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C24755OooO00o f126179OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C35116OooO0OO f126180OooO0oO;

    public C35139Oooo00o(C24755OooO00o c24755OooO00o, char[] cArr) throws CharacterCodingException {
        this.f126179OooO0o0 = c24755OooO00o;
        this.f126180OooO0oO = new C35116OooO0OO(cArr);
        OooOooo(0);
    }

    @Override // ooOOoOO0.AbstractC35114OooO00o
    public final void OooO0O0(int i, int i2) {
        this.f126102OooO0Oo.append(this.f126180OooO0oO.f126107OooOo0o, i, i2 - i);
    }

    @Override // ooOOoOO0.AbstractC35114OooO00o
    public boolean OooO0OO() throws CharacterCodingException {
        OooOOOO();
        int i = this.f126099OooO00o;
        while (true) {
            int iOooOoO = OooOoO(i);
            if (iOooOoO == -1) {
                this.f126099OooO00o = iOooOoO;
                return false;
            }
            char c = this.f126180OooO0oO.f126107OooOo0o[iOooOoO];
            if (c != ' ' && c != '\n' && c != '\r' && c != '\t') {
                this.f126099OooO00o = iOooOoO;
                return AbstractC35114OooO00o.OooOo0O(c);
            }
            i = iOooOoO + 1;
        }
    }

    @Override // ooOOoOO0.AbstractC35114OooO00o
    public byte OooO0o() throws CharacterCodingException {
        OooOOOO();
        int i = this.f126099OooO00o;
        while (true) {
            int iOooOoO = OooOoO(i);
            if (iOooOoO == -1) {
                this.f126099OooO00o = iOooOoO;
                return (byte) 10;
            }
            int i2 = iOooOoO + 1;
            byte bOooO0OO = C22306Ooooooo.OooO0OO(this.f126180OooO0oO.f126107OooOo0o[iOooOoO]);
            if (bOooO0OO != 3) {
                this.f126099OooO00o = i2;
                return bOooO0OO;
            }
            i = i2;
        }
    }

    @Override // ooOOoOO0.AbstractC35114OooO00o
    public final String OooO0o0() throws CharacterCodingException {
        char[] cArr;
        OooO0oo('\"');
        int i = this.f126099OooO00o;
        C35116OooO0OO c35116OooO0OO = this.f126180OooO0oO;
        int i2 = c35116OooO0OO.f126106OooOo;
        int i3 = i;
        while (true) {
            cArr = c35116OooO0OO.f126107OooOo0o;
            if (i3 >= i2) {
                i3 = -1;
                break;
            }
            if (cArr[i3] == '\"') {
                break;
            }
            i3++;
        }
        if (i3 == -1) {
            int iOooOoO = OooOoO(i);
            if (iOooOoO != -1) {
                return OooOO0O(c35116OooO0OO, this.f126099OooO00o, iOooOoO);
            }
            OooOOoo((byte) 1, true);
            throw null;
        }
        for (int i4 = i; i4 < i3; i4++) {
            if (cArr[i4] == '\\') {
                return OooOO0O(c35116OooO0OO, this.f126099OooO00o, i4);
            }
        }
        this.f126099OooO00o = i3 + 1;
        return C33595OooOOo.OooOOOO(cArr, i, Math.min(i3, c35116OooO0OO.f126106OooOo));
    }

    @Override // ooOOoOO0.AbstractC35114OooO00o
    public void OooO0oo(char c) throws CharacterCodingException {
        OooOOOO();
        int i = this.f126099OooO00o;
        while (true) {
            int iOooOoO = OooOoO(i);
            if (iOooOoO == -1) {
                this.f126099OooO00o = iOooOoO;
                OooOooO(c);
                throw null;
            }
            int i2 = iOooOoO + 1;
            char c2 = this.f126180OooO0oO.f126107OooOo0o[iOooOoO];
            if (c2 != ' ' && c2 != '\n' && c2 != '\r' && c2 != '\t') {
                this.f126099OooO00o = i2;
                if (c2 == c) {
                    return;
                }
                OooOooO(c);
                throw null;
            }
            i = i2;
        }
    }

    @Override // ooOOoOO0.AbstractC35114OooO00o
    public final void OooOOOO() throws CharacterCodingException {
        int i = this.f126180OooO0oO.f126106OooOo - this.f126099OooO00o;
        if (i > this.f126178OooO0o) {
            return;
        }
        OooOooo(i);
    }

    @Override // ooOOoOO0.AbstractC35114OooO00o
    public final CharSequence OooOo0() {
        return this.f126180OooO0oO;
    }

    @Override // ooOOoOO0.AbstractC35114OooO00o
    public final String OooOo0o(String keyToMatch, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(keyToMatch, "keyToMatch");
        return null;
    }

    @Override // ooOOoOO0.AbstractC35114OooO00o
    public final int OooOoO(int i) throws CharacterCodingException {
        C35116OooO0OO c35116OooO0OO = this.f126180OooO0oO;
        if (i < c35116OooO0OO.f126106OooOo) {
            return i;
        }
        this.f126099OooO00o = i;
        OooOOOO();
        return (this.f126099OooO00o != 0 || c35116OooO0OO.length() == 0) ? -1 : 0;
    }

    @Override // ooOOoOO0.AbstractC35114OooO00o
    public int OooOoOO() throws CharacterCodingException {
        int iOooOoO;
        char c;
        int i = this.f126099OooO00o;
        while (true) {
            iOooOoO = OooOoO(i);
            if (iOooOoO == -1 || !((c = this.f126180OooO0oO.f126107OooOo0o[iOooOoO]) == ' ' || c == '\n' || c == '\r' || c == '\t')) {
                break;
            }
            i = iOooOoO + 1;
        }
        this.f126099OooO00o = iOooOoO;
        return iOooOoO;
    }

    @Override // ooOOoOO0.AbstractC35114OooO00o
    public final String OooOoo0(int i, int i2) {
        C35116OooO0OO c35116OooO0OO = this.f126180OooO0oO;
        return C33595OooOOo.OooOOOO(c35116OooO0OO.f126107OooOo0o, i, Math.min(i2, c35116OooO0OO.f126106OooOo));
    }

    public final void OooOooo(int i) throws CharacterCodingException {
        C35116OooO0OO c35116OooO0OO = this.f126180OooO0oO;
        char[] cArr = c35116OooO0OO.f126107OooOo0o;
        if (i != 0) {
            int i2 = this.f126099OooO00o;
            Oooo.OooO0OO.OooO0o(cArr, 0, i2, cArr, i2 + i);
        }
        int i3 = c35116OooO0OO.f126106OooOo;
        while (true) {
            if (i == i3) {
                break;
            }
            int iOooO00o = ((C35122OooOO0) this.f126179OooO0o0.f83961OooOo0o).OooO00o(cArr, i, i3 - i);
            if (iOooO00o == -1) {
                c35116OooO0OO.f126106OooOo = Math.min(c35116OooO0OO.f126107OooOo0o.length, i);
                this.f126178OooO0o = -1;
                break;
            }
            i += iOooO00o;
        }
        this.f126099OooO00o = 0;
    }
}
