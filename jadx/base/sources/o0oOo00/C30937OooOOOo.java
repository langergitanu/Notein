package o0oOo00;

import android.net.Uri;
import androidx.datastore.preferences.protobuf.o000oOoO;
import com.orion.notein.domain.models.sticker.Sticker;
import com.orion.notein.domain.models.sticker.StickerCollection;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.OooOo00;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.OooOo;
import oOo000Oo.Oooo0;

/* JADX INFO: renamed from: o0oOo00.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.edit.StickerCollectionEditViewModel$stickerUris$1", m80623f = "StickerCollectionEditViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30937OooOOOo extends AbstractC32476OooO implements OooOo00<StickerCollection, List<? extends Sticker>, List<? extends Uri>, List<? extends Uri>, List<? extends Uri>, Continuation<? super List<? extends Uri>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ List f110567OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ StickerCollection f110568OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ List f110569OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ List f110570OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ List f110571OooOoOO;

    public C30937OooOOOo(Continuation<? super C30937OooOOOo> continuation) {
        super(6, continuation);
    }

    @Override // oO0O000o.OooOo00
    public final Object Oooo0OO(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Serializable serializable) {
        C30937OooOOOo c30937OooOOOo = new C30937OooOOOo((Continuation) serializable);
        c30937OooOOOo.f110568OooOo0o = (StickerCollection) obj;
        c30937OooOOOo.f110567OooOo = (List) obj2;
        c30937OooOOOo.f110570OooOoO0 = (List) obj3;
        c30937OooOOOo.f110569OooOoO = (List) obj4;
        c30937OooOOOo.f110571OooOoOO = (List) obj5;
        return c30937OooOOOo.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v5, types: [oOo000Oo.OooOoO] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        ?? arrayList;
        List<String> children;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        StickerCollection stickerCollection = this.f110568OooOo0o;
        List list = this.f110567OooOo;
        List list2 = this.f110570OooOoO0;
        List list3 = this.f110569OooOoO;
        List list4 = this.f110571OooOoOO;
        List list5 = list;
        int iOooO0Oo = Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list5, 10));
        if (iOooO0Oo < 16) {
            iOooO0Oo = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO0Oo);
        for (Object obj2 : list5) {
            linkedHashMap.put(((Sticker) obj2).getId(), obj2);
        }
        if (stickerCollection == null || (children = stickerCollection.getChildren()) == null) {
            arrayList = C34434OooOoO.f123453OooOo0o;
        } else {
            arrayList = new ArrayList();
            Iterator it = children.iterator();
            while (it.hasNext()) {
                Sticker sticker = (Sticker) linkedHashMap.get((String) it.next());
                if (sticker != null) {
                    arrayList.add(sticker);
                }
            }
        }
        C34406OooO00o.f123390OooO00o.OooO00o(o000oOoO.OooO00o(arrayList, "originalSortedStickers: "), new Object[0]);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = ((Iterable) arrayList).iterator();
        while (it2.hasNext()) {
            File file = new File(((Sticker) it2.next()).getPath());
            if (!file.exists()) {
                file = null;
            }
            Uri uriFromFile = file != null ? Uri.fromFile(file) : null;
            if (uriFromFile != null) {
                arrayList2.add(uriFromFile);
            }
        }
        List list6 = list4;
        return OooOo.OooooOO(OooOo.Ooooo00(OooOo.Ooooo00(OooOo.OooooOO(list2, arrayList2), OooOo.o0OO00O(list3)), OooOo.o0OO00O(list6)), list6);
    }
}
