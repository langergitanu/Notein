package o0o0OOO;

import androidx.appcompat.widget.C21532OooOOo;
import androidx.fragment.app.Fragment;
import com.orion.notein.p607ui.paperconfig.MyTemplateFragment;
import com.orion.notein.p607ui.paperconfig.StandardTemplateFragment;

/* JADX INFO: renamed from: o0o0OOO.o00000oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30523o00000oO extends o00O00OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f109091OooO;

    @Override // o00O00OO.OooO0O0
    public final boolean OooO0Oo(long j) {
        if (j == 0) {
            return true;
        }
        if (j == 1) {
            return this.f109091OooO;
        }
        return false;
    }

    @Override // o00O00OO.OooO0O0
    public final Fragment OooO0o0(int i) {
        if (i == 0) {
            return new StandardTemplateFragment();
        }
        if (i != 1) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "Invalid position: "));
        }
        if (this.f109091OooO) {
            return new MyTemplateFragment();
        }
        throw new IllegalArgumentException("My template tab is disabled");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final int getItemCount() {
        return this.f109091OooO ? 2 : 1;
    }

    @Override // o00O00OO.OooO0O0, androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final long getItemId(int i) {
        if (i == 0) {
            return 0L;
        }
        if (i != 1) {
            return i;
        }
        return 1L;
    }
}
