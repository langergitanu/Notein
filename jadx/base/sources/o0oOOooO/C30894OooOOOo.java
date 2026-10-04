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

/* JADX INFO: renamed from: o0oOOooO.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.StickerViewModel$stickerCollection$1", m80623f = "StickerViewModel.kt", m80624l = {212}, m80625m = "invokeSuspend")
public final class C30894OooOOOo extends AbstractC32476OooO implements InterfaceC32510OooOOo0<List<? extends StickerCollection>, String, Continuation<? super List<? extends C31077OoooOOo>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Iterator f110402OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Collection f110403OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Collection f110404OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public StickerCollection f110405OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Collection f110406OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public /* synthetic */ Object f110407OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f110408OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public /* synthetic */ Object f110409OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ C30898OooOo00 f110410OooOooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30894OooOOOo(Continuation continuation, C30898OooOo00 c30898OooOo00) {
        super(3, continuation);
        this.f110410OooOooo = c30898OooOo00;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(List<? extends StickerCollection> list, String str, Continuation<? super List<? extends C31077OoooOOo>> continuation) {
        C30894OooOOOo c30894OooOOOo = new C30894OooOOOo(continuation, this.f110410OooOooo);
        c30894OooOOOo.f110407OooOoo = list;
        c30894OooOOOo.f110409OooOooO = str;
        return c30894OooOOOo.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00a8 -> B:17:0x00ab). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00ae -> B:19:0x00b2). Please report as a decompilation issue!!! */
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
        int i = this.f110408OooOoo0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            List list = (List) this.f110407OooOoo;
            String str2 = (String) this.f110409OooOooO;
            List listOooO0oO = OooOo.OooO0oO(new C31077OoooOOo(null, null, null, null, false, false, 223));
            List list2 = list;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
            it = list2.iterator();
            collection = arrayList;
            str = str2;
            collection2 = listOooO0oO;
            c30898OooOo00 = this.f110410OooOooo;
            if (!it.hasNext()) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            collection = this.f110406OooOoOO;
            collection2 = this.f110404OooOoO;
            StickerCollection stickerCollection = this.f110405OooOoO0;
            it = this.f110402OooOo;
            Collection collection3 = this.f110403OooOo0o;
            C30898OooOo00 c30898OooOo002 = (C30898OooOo00) this.f110409OooOooO;
            String str3 = (String) this.f110407OooOoo;
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
                    this.f110407OooOoo = str;
                    this.f110409OooOooO = c30898OooOo00;
                    Collection collection5 = collection;
                    this.f110403OooOo0o = collection5;
                    this.f110402OooOo = it;
                    this.f110405OooOoO0 = stickerCollection;
                    this.f110404OooOoO = collection2;
                    this.f110406OooOoOO = collection5;
                    this.f110408OooOoo0 = 1;
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
                        return oOo000Oo.OooOo.OooooOO(collection2, (List) collection);
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
