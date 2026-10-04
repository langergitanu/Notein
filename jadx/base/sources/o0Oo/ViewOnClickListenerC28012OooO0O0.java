package o0Oo;

import Oooo0oO.C21030OooOO0o;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.creative_library.CreativeLibraryListFragment;
import com.orion.notein.p607ui.login.firebase.FirebaseUserAuthFragment;
import com.orion.notein.p607ui.notelist.fabbottomsheet.FabMediasFragment;
import com.orion.notein.p607ui.notelist.recover.RecoverNoteFromCloudDialogFragment;
import java.util.concurrent.CancellationException;
import o000o0O0.C24564OooO00o;
import o0Oo00o.C28026OooO0OO;
import o0Oo0oOo.C28340Oooo00o;
import o0OoO000.o0OoOo0;
import o0o0O00.C30207OooOo;
import o0o0Oo00.C30603OooO0O0;
import o0o0Oo00.C30605OooO0OO;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.o00000OO;
import oO0o0Oo.C33781o00o0O;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0Oo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28012OooO0O0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f99347OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f99348OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28012OooO0O0(Object obj, int i) {
        this.f99348OooOo0o = i;
        this.f99347OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f99347OooOo;
        switch (this.f99348OooOo0o) {
            case 0:
                ViewOnClickListenerC28013OooO0OO viewOnClickListenerC28013OooO0OO = ((C28011OooO00o) obj).f99343OooO0O0;
                if (viewOnClickListenerC28013OooO0OO != null) {
                    viewOnClickListenerC28013OooO0OO.onClick(view);
                    return;
                }
                return;
            case 1:
                C21030OooOO0o.OooO0OO((CreativeLibraryListFragment) obj).OooOOOO(new C28340Oooo00o());
                return;
            case 2:
                FirebaseUserAuthFragment firebaseUserAuthFragment = (FirebaseUserAuthFragment) obj;
                EditText editText = firebaseUserAuthFragment.f72325Oooo;
                if (editText == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("etEmail");
                    throw null;
                }
                String string = C33599OooOo0O.Oooooo0(editText.getText().toString()).toString();
                if (string != null && Patterns.EMAIL_ADDRESS.matcher(string).matches()) {
                    firebaseUserAuthFragment.Oooo0();
                    C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(firebaseUserAuthFragment), new o0OoOo0(string));
                    return;
                } else {
                    EditText editText2 = firebaseUserAuthFragment.f72325Oooo;
                    if (editText2 != null) {
                        editText2.setError(firebaseUserAuthFragment.getString(R.string.error_wrong_email_format));
                        return;
                    } else {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("etEmail");
                        throw null;
                    }
                }
            case 3:
                C30207OooOo.OooO00o oooO00o = ((FabMediasFragment) obj).f77467OooOo0o;
                if (oooO00o != null) {
                    oooO00o.OooOO0O();
                    return;
                }
                return;
            default:
                RecoverNoteFromCloudDialogFragment recoverNoteFromCloudDialogFragment = (RecoverNoteFromCloudDialogFragment) obj;
                C30603OooO0O0 c30603OooO0O0OooOoo0 = recoverNoteFromCloudDialogFragment.OooOoo0();
                o00000OO o00000oo2 = c30603OooO0O0OooOoo0.f109498OooO0oo;
                if (o00000oo2 != null) {
                    o00000oo2.cancel((CancellationException) null);
                }
                C33781o00o0O c33781o00o0O = c30603OooO0O0OooOoo0.f109511OooOo00;
                c33781o00o0O.getClass();
                c33781o00o0O.OooOO0(null, 0);
                InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = androidx.lifecycle.o0OoOo0.OooO00o(c30603OooO0O0OooOoo0);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                c30603OooO0O0OooOoo0.f109498OooO0oo = C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30605OooO0OO(c30603OooO0O0OooOoo0, null), 2);
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(recoverNoteFromCloudDialogFragment), new C24564OooO00o(R.id.f57976xe80fbe8e));
                return;
        }
    }
}
