package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.C22031OooO0oo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class Oooo000 extends RecyclerView.AbstractC22064OooOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f66038OooO0oO = true;

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22064OooOO0o
    public final boolean OooO00o(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, RecyclerView.AbstractC22064OooOO0o.OooO0OO oooO0OO, RecyclerView.AbstractC22064OooOO0o.OooO0OO oooO0OO2) {
        int i;
        int i2;
        if (oooO0OO != null && ((i = oooO0OO.f66062OooO00o) != (i2 = oooO0OO2.f66062OooO00o) || oooO0OO.f66063OooO0O0 != oooO0OO2.f66063OooO0O0)) {
            return OooOO0o(abstractC22078OooOooO, i, oooO0OO.f66063OooO0O0, i2, oooO0OO2.f66063OooO0O0);
        }
        C22031OooO0oo c22031OooO0oo = (C22031OooO0oo) this;
        c22031OooO0oo.OooOOo0(abstractC22078OooOooO);
        abstractC22078OooOooO.itemView.setAlpha(0.0f);
        c22031OooO0oo.f65834OooO.add(abstractC22078OooOooO);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22064OooOO0o
    public final boolean OooO0O0(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO2, RecyclerView.AbstractC22064OooOO0o.OooO0OO oooO0OO, RecyclerView.AbstractC22064OooOO0o.OooO0OO oooO0OO2) {
        int i;
        int i2;
        int i3 = oooO0OO.f66062OooO00o;
        int i4 = oooO0OO.f66063OooO0O0;
        if (abstractC22078OooOooO2.shouldIgnore()) {
            int i5 = oooO0OO.f66062OooO00o;
            i2 = oooO0OO.f66063OooO0O0;
            i = i5;
        } else {
            i = oooO0OO2.f66062OooO00o;
            i2 = oooO0OO2.f66063OooO0O0;
        }
        C22031OooO0oo c22031OooO0oo = (C22031OooO0oo) this;
        if (abstractC22078OooOooO == abstractC22078OooOooO2) {
            return c22031OooO0oo.OooOO0o(abstractC22078OooOooO, i3, i4, i, i2);
        }
        float translationX = abstractC22078OooOooO.itemView.getTranslationX();
        float translationY = abstractC22078OooOooO.itemView.getTranslationY();
        float alpha = abstractC22078OooOooO.itemView.getAlpha();
        c22031OooO0oo.OooOOo0(abstractC22078OooOooO);
        abstractC22078OooOooO.itemView.setTranslationX(translationX);
        abstractC22078OooOooO.itemView.setTranslationY(translationY);
        abstractC22078OooOooO.itemView.setAlpha(alpha);
        c22031OooO0oo.OooOOo0(abstractC22078OooOooO2);
        abstractC22078OooOooO2.itemView.setTranslationX(-((int) ((i - i3) - translationX)));
        abstractC22078OooOooO2.itemView.setTranslationY(-((int) ((i2 - i4) - translationY)));
        abstractC22078OooOooO2.itemView.setAlpha(0.0f);
        ArrayList<C22031OooO0oo.C22032OooO0Oo> arrayList = c22031OooO0oo.f65837OooOO0O;
        C22031OooO0oo.C22032OooO0Oo c22032OooO0Oo = new C22031OooO0oo.C22032OooO0Oo();
        c22032OooO0Oo.f65851OooO00o = abstractC22078OooOooO;
        c22032OooO0Oo.f65852OooO0O0 = abstractC22078OooOooO2;
        c22032OooO0Oo.f65853OooO0OO = i3;
        c22032OooO0Oo.f65854OooO0Oo = i4;
        c22032OooO0Oo.f65856OooO0o0 = i;
        c22032OooO0Oo.f65855OooO0o = i2;
        arrayList.add(c22032OooO0Oo);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22064OooOO0o
    public final boolean OooO0OO(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, RecyclerView.AbstractC22064OooOO0o.OooO0OO oooO0OO, RecyclerView.AbstractC22064OooOO0o.OooO0OO oooO0OO2) {
        int i = oooO0OO.f66062OooO00o;
        int i2 = oooO0OO.f66063OooO0O0;
        View view = abstractC22078OooOooO.itemView;
        int left = oooO0OO2 == null ? view.getLeft() : oooO0OO2.f66062OooO00o;
        int top = oooO0OO2 == null ? view.getTop() : oooO0OO2.f66063OooO0O0;
        if (!abstractC22078OooOooO.isRemoved() && (i != left || i2 != top)) {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            return OooOO0o(abstractC22078OooOooO, i, i2, left, top);
        }
        C22031OooO0oo c22031OooO0oo = (C22031OooO0oo) this;
        c22031OooO0oo.OooOOo0(abstractC22078OooOooO);
        c22031OooO0oo.f65835OooO0oo.add(abstractC22078OooOooO);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22064OooOO0o
    public final boolean OooO0Oo(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, RecyclerView.AbstractC22064OooOO0o.OooO0OO oooO0OO, RecyclerView.AbstractC22064OooOO0o.OooO0OO oooO0OO2) {
        int i = oooO0OO.f66062OooO00o;
        int i2 = oooO0OO2.f66062OooO00o;
        if (i != i2 || oooO0OO.f66063OooO0O0 != oooO0OO2.f66063OooO0O0) {
            return OooOO0o(abstractC22078OooOooO, i, oooO0OO.f66063OooO0O0, i2, oooO0OO2.f66063OooO0O0);
        }
        OooO0oO(abstractC22078OooOooO);
        return false;
    }

    public abstract boolean OooOO0o(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i, int i2, int i3, int i4);
}
