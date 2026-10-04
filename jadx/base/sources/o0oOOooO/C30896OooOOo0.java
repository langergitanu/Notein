package o0oOOooO;

import com.facebook.soloader.OooOo;
import com.orion.notein.domain.models.sticker.Sticker;
import com.orion.notein.domain.models.sticker.StickerCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOo0Oo.InterfaceC27321Oooo0o;
import o0oOoOo.C31077OoooOOo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0oOOooO.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.StickerViewModel$stickerCollectionWithLatest$1", m80623f = "StickerViewModel.kt", m80624l = {185}, m80625m = "invokeSuspend")
public final class C30896OooOOo0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<List<? extends StickerCollection>, String, Continuation<? super List<? extends C31077OoooOOo>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Iterator f110420OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Collection f110421OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Collection f110422OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public StickerCollection f110423OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Collection f110424OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public /* synthetic */ Object f110425OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f110426OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public /* synthetic */ Object f110427OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ C30898OooOo00 f110428OooOooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30896OooOOo0(Continuation continuation, C30898OooOo00 c30898OooOo00) {
        super(3, continuation);
        this.f110428OooOooo = c30898OooOo00;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(List<? extends StickerCollection> list, String str, Continuation<? super List<? extends C31077OoooOOo>> continuation) {
        C30896OooOOo0 c30896OooOOo0 = new C30896OooOOo0(continuation, this.f110428OooOooo);
        c30896OooOOo0.f110425OooOoo = list;
        c30896OooOOo0.f110427OooOooO = str;
        return c30896OooOOo0.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ee  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00b1 -> B:21:0x00b4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00b7 -> B:23:0x00bb). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        Collection collection;
        String str;
        Collection collection2;
        C30898OooOo00 c30898OooOo00;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f110426OooOoo0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            List list = (List) this.f110425OooOoo;
            String str2 = (String) this.f110427OooOooO;
            List listOooO0oO = OooOo.OooO0oO(new C31077OoooOOo(null, null, null, null, false, str2.length() == 0, 63));
            List list2 = list;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
            it = list2.iterator();
            collection = arrayList;
            str = str2;
            collection2 = listOooO0oO;
            c30898OooOo00 = this.f110428OooOooo;
            if (!it.hasNext()) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            collection = this.f110424OooOoOO;
            collection2 = this.f110422OooOoO;
            StickerCollection stickerCollection = this.f110423OooOoO0;
            it = this.f110420OooOo;
            Collection collection3 = this.f110421OooOo0o;
            C30898OooOo00 c30898OooOo002 = (C30898OooOo00) this.f110427OooOooO;
            String str3 = (String) this.f110425OooOoo;
            C32446OooOOOo.OooO0O0(obj);
            String str4 = str3;
            C30898OooOo00 c30898OooOo003 = c30898OooOo002;
            Collection collection4 = collection3;
            Object objOooO0Oo = obj;
            Sticker sticker = (Sticker) objOooO0Oo;
            collection.add(new C31077OoooOOo(stickerCollection.getId(), c30898OooOo003.f110434OooO0o.OooO0o(stickerCollection), sticker != null ? sticker.getPath() : null, stickerCollection.getChildren(), stickerCollection.getBuiltIn(), kotlin.jvm.internal.OooOOO0.OooO0O0(stickerCollection.getId(), str4), 160));
            collection = collection4;
            c30898OooOo00 = c30898OooOo003;
            str = str4;
            if (!it.hasNext()) {
                stickerCollection = (StickerCollection) it.next();
                String str5 = (String) oOo000Oo.OooOo.Oooo(stickerCollection.getChildren());
                if (str5 != null) {
                    InterfaceC27321Oooo0o interfaceC27321Oooo0o = c30898OooOo00.f110433OooO0Oo;
                    String id = stickerCollection.getId();
                    this.f110425OooOoo = str;
                    this.f110427OooOooO = c30898OooOo00;
                    Collection collection5 = collection;
                    this.f110421OooOo0o = collection5;
                    this.f110420OooOo = it;
                    this.f110423OooOoO0 = stickerCollection;
                    this.f110422OooOoO = collection2;
                    this.f110424OooOoOO = collection5;
                    this.f110426OooOoo0 = 1;
                    objOooO0Oo = interfaceC27321Oooo0o.OooO0Oo(str5, id, this);
                    if (objOooO0Oo == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    str4 = str;
                    c30898OooOo003 = c30898OooOo00;
                    collection4 = collection;
                    Sticker sticker2 = (Sticker) objOooO0Oo;
                    if (sticker2 != null) {
                    }
                    collection.add(new C31077OoooOOo(stickerCollection.getId(), c30898OooOo003.f110434OooO0o.OooO0o(stickerCollection), sticker2 != null ? sticker2.getPath() : null, stickerCollection.getChildren(), stickerCollection.getBuiltIn(), kotlin.jvm.internal.OooOOO0.OooO0O0(stickerCollection.getId(), str4), 160));
                    collection = collection4;
                    c30898OooOo00 = c30898OooOo003;
                    str = str4;
                    if (!it.hasNext()) {
                        return oOo000Oo.OooOo.OooooOO(oOo000Oo.OooOo.OooooOO(collection2, (List) collection), OooOo.OooO0oO(new C31077OoooOOo(null, null, null, null, false, false, 223)));
                    }
                } else {
                    sticker2 = null;
                    str4 = str;
                    c30898OooOo003 = c30898OooOo00;
                    collection4 = collection;
                    if (sticker2 != null) {
                    }
                    collection.add(new C31077OoooOOo(stickerCollection.getId(), c30898OooOo003.f110434OooO0o.OooO0o(stickerCollection), sticker2 != null ? sticker2.getPath() : null, stickerCollection.getChildren(), stickerCollection.getBuiltIn(), kotlin.jvm.internal.OooOOO0.OooO0O0(stickerCollection.getId(), str4), 160));
                    collection = collection4;
                    c30898OooOo00 = c30898OooOo003;
                    str = str4;
                    if (!it.hasNext()) {
                    }
                }
            }
        }
    }
}
