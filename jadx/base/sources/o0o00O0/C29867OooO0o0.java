package o0o00O0;

import android.view.View;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0Oo0O0.C28050OooO0OO;
import o0OoO0oo.C28755o00000o0;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34438OooOoo0;

/* JADX INFO: renamed from: o0o00O0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29867OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final View f105969OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public o0OO0o.OooO0OO f105970OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<Integer> f105971OooO0OO;

    public C29867OooO0o0(View view) {
        OooOOO0.OooO0oO(view, "view");
        this.f105969OooO00o = view;
        List<Integer> listOooOO0o = C34429OooOOo0.OooOO0o(Integer.valueOf(R.id.item_ai_ocr), Integer.valueOf(R.id.item_ai_assistant));
        this.f105971OooO0OO = listOooOO0o;
        Iterator<T> it = listOooOO0o.iterator();
        while (it.hasNext()) {
            final int iIntValue = ((Number) it.next()).intValue();
            View viewFindViewById = this.f105969OooO00o.findViewById(iIntValue);
            OooOOO0.OooO0Oo(viewFindViewById);
            C28050OooO0OO.OooO00o(viewFindViewById, 500L, new View.OnClickListener() { // from class: o0o00O0.OooO0Oo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    o0OO0o.OooO0OO oooO0OO = this.f105968OooOo0o.f105970OooO0O0;
                    if (oooO0OO != null) {
                        BaseToolbarChildFragment baseToolbarChildFragment = (BaseToolbarChildFragment) oooO0OO.f92717OooO00o;
                        baseToolbarChildFragment.Ooooo0o();
                        baseToolbarChildFragment.OoooOo0(C34438OooOoo0.f123458OooOo0o);
                        switch (iIntValue) {
                            case R.id.item_ai_assistant /* 2131297850 */:
                                C28755o00000o0 c28755o00000o0 = baseToolbarChildFragment.f76506o000oOoO;
                                if (c28755o00000o0 != null) {
                                    c28755o00000o0.OooO00o(100);
                                }
                                break;
                            case R.id.item_ai_ocr /* 2131297851 */:
                                C28755o00000o0 c28755o00000o02 = baseToolbarChildFragment.f76506o000oOoO;
                                if (c28755o00000o02 != null) {
                                    c28755o00000o02.OooO00o(101);
                                }
                                break;
                        }
                    }
                }
            });
        }
    }
}
