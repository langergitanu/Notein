package o00oo0Oo;

import android.content.ContentResolver;
import androidx.fragment.app.Fragment;
import com.facebook.imagepipeline.producers.C22280Oooo00O;
import com.facebook.imagepipeline.producers.InterfaceC22305OoooooO;
import com.facebook.imagepipeline.producers.LocalExifThumbnailProducer;
import com.orion.notein.p607ui.backup.BackupResultDialogFragment;
import java.util.concurrent.ExecutorService;
import o00ooO0.C25750OooOoOO;

/* JADX INFO: renamed from: o00oo0Oo.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C25716Oooo0O0 implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f87774OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f87775OooOo0o;

    public /* synthetic */ C25716Oooo0O0(Object obj, int i) {
        this.f87775OooOo0o = i;
        this.f87774OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        Object obj = this.f87774OooOo;
        switch (this.f87775OooOo0o) {
            case 0:
                C25722OoooO00 this$0 = (C25722OoooO00) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(this$0, "this$0");
                OooOo oooOo = this$0.f87785OooO0O0;
                ExecutorService executorServiceOooO0OO = oooOo.f87710OooO.OooO0OO();
                ContentResolver contentResolver = oooOo.f87711OooO00o;
                C25750OooOoOO c25750OooOoOO = oooOo.f87719OooOO0;
                com.facebook.imagepipeline.producers.Oooo000 oooo000 = new com.facebook.imagepipeline.producers.Oooo000(executorServiceOooO0OO, c25750OooOoOO, contentResolver);
                InterfaceC25699OooOOOo interfaceC25699OooOOOo = oooOo.f87710OooO;
                return this$0.OooO0oO(oooo000, new InterfaceC22305OoooooO[]{new C22280Oooo00O(interfaceC25699OooOOOo.OooO0OO(), c25750OooOoOO), new LocalExifThumbnailProducer(interfaceC25699OooOOOo.OooO0Oo(), c25750OooOoOO, oooOo.f87711OooO00o)});
            default:
                Fragment fragmentRequireParentFragment = ((BackupResultDialogFragment) obj).requireParentFragment();
                kotlin.jvm.internal.OooOOO0.OooO0o(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
        }
    }
}
