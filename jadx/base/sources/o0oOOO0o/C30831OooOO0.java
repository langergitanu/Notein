package o0oOOO0o;

import android.widget.SeekBar;
import com.orion.notein.domain.models.page.PagePaddingStyle;
import com.orion.notein.p607ui.noteeditor.pagepadding.PagePaddingFragment;
import o0Ooo0o0.EnumC29418OooO0O0;
import o0Ooo0o0.EnumC29419OooO0OO;
import o0Ooo0oO.C29423OooO00o;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: o0oOOO0o.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30831OooOO0 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PagePaddingFragment f110181OooO00o;

    public C30831OooOO0(PagePaddingFragment pagePaddingFragment) {
        this.f110181OooO00o = pagePaddingFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        PagePaddingStyle pagePaddingStyleOooO0o;
        PagePaddingFragment pagePaddingFragment = this.f110181OooO00o;
        C29423OooO00o.C19987OooO00o c19987OooO00o = pagePaddingFragment.f74958o0OoOo0;
        if (c19987OooO00o == null) {
            return;
        }
        int i2 = i + 10;
        PagePaddingFragment.OooOoOO(pagePaddingFragment, i2);
        if (z && c19987OooO00o.f104387OooO0O0) {
            C29423OooO00o c29423OooO00oOooOooO = pagePaddingFragment.OooOooO();
            int iOooO0o = oO0O00oo.OooOO0.OooO0o(i2, 10, 100);
            C33781o00o0O c33781o00o0O = c29423OooO00oOooOooO.f104376OooOo;
            if (((Number) c33781o00o0O.getValue()).intValue() == iOooO0o) {
                return;
            }
            c33781o00o0O.OooOO0(null, Integer.valueOf(iOooO0o));
            PagePaddingStyle pagePaddingStyle = (PagePaddingStyle) c29423OooO00oOooOooO.f104369OooOOO.getValue();
            if (pagePaddingStyle == null) {
                return;
            }
            EnumC29418OooO0O0 enumC29418OooO0O0OooO = C29423OooO00o.OooO(pagePaddingStyle);
            if (enumC29418OooO0O0OooO == null) {
                enumC29418OooO0O0OooO = (EnumC29418OooO0O0) c29423OooO00oOooOooO.f104371OooOOOO.f121747OooOo0o.getValue();
            }
            EnumC29418OooO0O0 enumC29418OooO0O0 = enumC29418OooO0O0OooO;
            EnumC29419OooO0OO enumC29419OooO0OO = (EnumC29419OooO0OO) c29423OooO00oOooOooO.f104372OooOOOo.f121747OooOo0o.getValue();
            Float fOooOO0O = c29423OooO00oOooOooO.OooOO0O(enumC29419OooO0OO);
            if (fOooOO0O == null || (pagePaddingStyleOooO0o = c29423OooO00oOooOooO.OooO0o(enumC29418OooO0O0, enumC29419OooO0OO, null, fOooOO0O, pagePaddingStyle)) == null) {
                return;
            }
            c29423OooO00oOooOooO.OooOOo0(pagePaddingStyleOooO0o);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
