package o0oOo00;

import android.net.Uri;
import com.orion.notein.domain.models.sticker.Sticker;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27532o00o0Oo;
import o0OOo0o.C27538o00o0o0O;
import o0oOoOo.C31078OoooOo0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.edit.StickerCollectionEditViewModel$stickerPreviewVOs$1", m80623f = "StickerCollectionEditViewModel.kt", m80624l = {126}, m80625m = "invokeSuspend")
public final class OooOOOO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<List<? extends Uri>, List<? extends Sticker>, Continuation<? super List<? extends C31078OoooOo0>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Iterator f110558OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Collection f110559OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Collection f110560OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Uri f110561OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f110562OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public /* synthetic */ List f110563OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f110564OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public /* synthetic */ Object f110565OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ C30938OooOOo f110566OooOooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(Continuation continuation, C30938OooOOo c30938OooOOo) {
        super(3, continuation);
        this.f110566OooOooo = c30938OooOOo;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(List<? extends Uri> list, List<? extends Sticker> list2, Continuation<? super List<? extends C31078OoooOo0>> continuation) {
        OooOOOO oooOOOO = new OooOOOO(continuation, this.f110566OooOooo);
        oooOOOO.f110563OooOoo = list;
        oooOOOO.f110565OooOooO = list2;
        return oooOOOO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0104  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00d8 -> B:25:0x00d9). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Collection arrayList;
        Iterator it;
        List list;
        C30938OooOOo c30938OooOOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f110564OooOoo0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            List list2 = this.f110563OooOoo;
            List list3 = (List) this.f110565OooOooO;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list3) {
                if (((Sticker) obj2).getBuiltIn()) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(Uri.fromFile(new File(((Sticker) it2.next()).getPath())));
            }
            List list4 = list2;
            arrayList = new ArrayList(C34428OooOOo.OooOOoo(list4, 10));
            it = list4.iterator();
            list = arrayList3;
            c30938OooOOo = this.f110566OooOooo;
            if (it.hasNext()) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = this.f110562OooOoOO;
            arrayList = this.f110560OooOoO;
            Uri uri = this.f110561OooOoO0;
            it = this.f110558OooOo;
            Collection collection = this.f110559OooOo0o;
            c30938OooOOo = (C30938OooOOo) this.f110565OooOooO;
            list = this.f110563OooOoo;
            C32446OooOOOo.OooO0O0(obj);
            C31078OoooOo0 c31078OoooOo0 = new C31078OoooOo0(uri, ((Boolean) obj).booleanValue(), i2 == 0);
            C34406OooO00o.f123390OooO00o.OooO00o("StickerPreviewVO: " + c31078OoooOo0, new Object[0]);
            arrayList.add(c31078OoooOo0);
            arrayList = collection;
            if (it.hasNext()) {
                uri = (Uri) it.next();
                i2 = !list.contains(uri) ? 1 : 0;
                C27538o00o0o0O c27538o00o0o0O = c30938OooOOo.f110573OooO0Oo;
                this.f110563OooOoo = list;
                this.f110565OooOooO = c30938OooOOo;
                Collection collection2 = arrayList;
                this.f110559OooOo0o = collection2;
                this.f110558OooOo = it;
                this.f110561OooOoO0 = uri;
                this.f110560OooOoO = collection2;
                this.f110562OooOoOO = i2;
                this.f110564OooOoo0 = 1;
                c27538o00o0o0O.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27532o00o0Oo(c27538o00o0o0O, uri, null), this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                collection = arrayList;
                C31078OoooOo0 c31078OoooOo02 = new C31078OoooOo0(uri, ((Boolean) obj).booleanValue(), i2 == 0);
                C34406OooO00o.f123390OooO00o.OooO00o("StickerPreviewVO: " + c31078OoooOo02, new Object[0]);
                arrayList.add(c31078OoooOo02);
                arrayList = collection;
                if (it.hasNext()) {
                    return (List) arrayList;
                }
            }
        }
    }
}
