package o0oOoOO0;

import OooOooo.C20785Oooo00o;
import androidx.appcompat.app.OooOOO;
import com.orion.notein.global.R;
import kotlin.jvm.internal.OooOOO0;
import o0O0ooo0.EnumC26248OooOo0;

/* JADX INFO: renamed from: o0oOoOO0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31016OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f110733OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final EnumC26248OooOo0 f110734OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f110735OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f110736OooO0Oo;

    public C31016OooO0O0() {
        this(0);
    }

    public static C31016OooO0O0 OooO00o(C31016OooO0O0 c31016OooO0O0, EnumC26248OooOo0 enumC26248OooOo0, int i, boolean z) {
        String nickname = c31016OooO0O0.f110733OooO00o;
        c31016OooO0O0.getClass();
        OooOOO0.OooO0oO(nickname, "nickname");
        return new C31016OooO0O0(nickname, enumC26248OooOo0, i, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31016OooO0O0)) {
            return false;
        }
        C31016OooO0O0 c31016OooO0O0 = (C31016OooO0O0) obj;
        return OooOOO0.OooO0O0(this.f110733OooO00o, c31016OooO0O0.f110733OooO00o) && this.f110734OooO0O0 == c31016OooO0O0.f110734OooO0O0 && this.f110735OooO0OO == c31016OooO0O0.f110735OooO0OO && this.f110736OooO0Oo == c31016OooO0O0.f110736OooO0Oo;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f110736OooO0Oo) + C20785Oooo00o.OooO00o(this.f110735OooO0OO, (this.f110734OooO0O0.hashCode() + (this.f110733OooO00o.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NicknameUiState(nickname=");
        sb.append(this.f110733OooO00o);
        sb.append(", fieldState=");
        sb.append(this.f110734OooO0O0);
        sb.append(", supportingTextRes=");
        sb.append(this.f110735OooO0OO);
        sb.append(", isDirty=");
        return OooOOO.OooO00o(sb, ")", this.f110736OooO0Oo);
    }

    public C31016OooO0O0(String nickname, EnumC26248OooOo0 fieldState, int i, boolean z) {
        OooOOO0.OooO0oO(nickname, "nickname");
        OooOOO0.OooO0oO(fieldState, "fieldState");
        this.f110733OooO00o = nickname;
        this.f110734OooO0O0 = fieldState;
        this.f110735OooO0OO = i;
        this.f110736OooO0Oo = z;
    }

    public /* synthetic */ C31016OooO0O0(int i) {
        this("", EnumC26248OooOo0.f89694OooOo0o, R.string.account_setting_nickname_hint, false);
    }
}
