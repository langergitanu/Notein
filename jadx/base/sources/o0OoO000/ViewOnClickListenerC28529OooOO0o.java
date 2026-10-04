package o0OoO000;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.p607ui.login.firebase.FirebaseCreateUserSetNameFragment;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;
import com.orion.notein.p607ui.user.settings.verifycode.VerifyCodeFragment;
import o0oOoOoO.C31097OooO0Oo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;

/* JADX INFO: renamed from: o0OoO000.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28529OooOO0o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f101137OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101138OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28529OooOO0o(Object obj, int i) {
        this.f101138OooOo0o = i;
        this.f101137OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f101138OooOo0o) {
            case 0:
                Context contextRequireContext = ((FirebaseCreateUserSetNameFragment) this.f101137OooOo).requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new C31097OooO0Oo(contextRequireContext, null), 3);
                return;
            case 1:
                PenBarChildFragment penBarChildFragment = (PenBarChildFragment) this.f101137OooOo;
                RecyclerView recyclerView = penBarChildFragment.f75249Oooo;
                if (recyclerView == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("rvPenList");
                    throw null;
                }
                RecyclerView.OooOOOO layoutManager = recyclerView.getLayoutManager();
                kotlin.jvm.internal.OooOOO0.OooO0o0(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                int itemCount = linearLayoutManager.getItemCount();
                int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition() + 1;
                if (iFindFirstVisibleItemPosition < itemCount) {
                    linearLayoutManager.scrollToPositionWithOffset(iFindFirstVisibleItemPosition, 0);
                }
                boolean z = linearLayoutManager.findLastCompletelyVisibleItemPosition() == itemCount - 1;
                ImageView imageView = penBarChildFragment.f75262OoooO00;
                if (imageView != null) {
                    imageView.setEnabled(!z);
                    return;
                }
                return;
            case 2:
                ViewOnClickListenerC28523OooO00o viewOnClickListenerC28523OooO00o = ((com.orion.notein.p607ui.noteeditor.propertypanel.outline.OooO00o) this.f101137OooOo).f75877OooO0O0;
                if (viewOnClickListenerC28523OooO00o != null) {
                    viewOnClickListenerC28523OooO00o.onClick(view);
                    return;
                }
                return;
            default:
                VerifyCodeFragment verifyCodeFragment = (VerifyCodeFragment) this.f101137OooOo;
                verifyCodeFragment.OooOoo0().OooO0o0(verifyCodeFragment.OooOoo());
                return;
        }
    }
}
