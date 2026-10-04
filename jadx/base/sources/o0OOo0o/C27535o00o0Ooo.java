package o0OOo0o;

import android.net.Uri;
import com.orion.notein.domain.models.sticker.CopyUriToStickerFileResult;
import com.orion.notein.domain.models.sticker.Sticker;
import com.orion.notein.domain.models.sticker.StickerCollection;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OOO0oo.C27072OooOO0O;
import o0OOo0Oo.InterfaceC27321Oooo0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OOo0o.o00o0Ooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.StickerUseCase$updateStickerCollection$2", m80623f = "StickerUseCase.kt", m80624l = {436, 441, 442, 445, 455, 466, 492}, m80625m = "invokeSuspend")
public final class C27535o00o0Ooo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public List f96516OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public StickerCollection f96517OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public ArrayList f96518OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public List f96519OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public ArrayList f96520OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ C27538o00o0o0O f96521OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f96522OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ String f96523OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ List<Uri> f96524OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final /* synthetic */ List<Uri> f96525Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final /* synthetic */ String f96526Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final /* synthetic */ List<Uri> f96527Oooo00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C27535o00o0Ooo(C27538o00o0o0O c27538o00o0o0O, String str, List<? extends Uri> list, List<? extends Uri> list2, String str2, List<? extends Uri> list3, Continuation<? super C27535o00o0Ooo> continuation) {
        super(2, continuation);
        this.f96521OooOoo = c27538o00o0o0O;
        this.f96523OooOooO = str;
        this.f96524OooOooo = list;
        this.f96525Oooo000 = list2;
        this.f96526Oooo00O = str2;
        this.f96527Oooo00o = list3;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27535o00o0Ooo(this.f96521OooOoo, this.f96523OooOooO, this.f96524OooOooo, this.f96525Oooo000, this.f96526Oooo00O, this.f96527Oooo00o, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C27535o00o0Ooo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x0301, code lost:
    
        if (r4.OooOO0O(r2, r24) != r1) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00dc A[PHI: r2 r8 r9
      0x00dc: PHI (r2v14 java.util.List) = (r2v11 java.util.List), (r2v16 java.util.List) binds: [B:27:0x00d8, B:9:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r8v11 com.orion.notein.domain.models.sticker.StickerCollection) = 
      (r8v9 com.orion.notein.domain.models.sticker.StickerCollection)
      (r8v13 com.orion.notein.domain.models.sticker.StickerCollection)
     binds: [B:27:0x00d8, B:9:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r9v7 java.lang.Object) = (r9v5 java.lang.Object), (r9v10 java.lang.Object) binds: [B:27:0x00d8, B:9:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f4 A[LOOP:9: B:30:0x00ee->B:32:0x00f4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0152 A[LOOP:5: B:41:0x014c->B:43:0x0152, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b4 A[LOOP:7: B:51:0x01ae->B:53:0x01b4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d7 A[LOOP:8: B:55:0x01d1->B:57:0x01d7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x020d A[LOOP:0: B:63:0x0207->B:65:0x020d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0260 A[LOOP:2: B:76:0x025a->B:78:0x0260, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0298 A[LOOP:3: B:84:0x0292->B:86:0x0298, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02bd  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooO;
        StickerCollection stickerCollection;
        Object objOooOOo;
        Object objOooO0Oo;
        StickerCollection stickerCollection2;
        List list;
        Object objOooO00o;
        ArrayList arrayList;
        InterfaceC27321Oooo0o interfaceC27321Oooo0o;
        StickerCollection stickerCollection3;
        List list2;
        List list3;
        int iOooO0Oo;
        Iterator it;
        ArrayList arrayList2;
        Iterator it2;
        InterfaceC27321Oooo0o interfaceC27321Oooo0o2;
        ArrayList arrayList3;
        Iterator it3;
        int iOooO0Oo2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96522OooOoo0;
        boolean z = true;
        String str = this.f96523OooOooO;
        C27538o00o0o0O c27538o00o0o0O = this.f96521OooOoo;
        switch (i) {
            case 0:
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC27321Oooo0o interfaceC27321Oooo0o3 = c27538o00o0o0O.f96550OooO00o;
                String strOooO0Oo = c27538o00o0o0O.f96551OooO0O0.OooO0Oo();
                this.f96522OooOoo0 = 1;
                objOooO = interfaceC27321Oooo0o3.OooO(str, strOooO0Oo, this);
                if (objOooO != enumC32485OooO00o) {
                    stickerCollection = (StickerCollection) objOooO;
                    if (stickerCollection != null) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("StickerUseCase");
                        z = false;
                        c20358OooO00o.OooOO0O("updateStickerCollection failed, Can not find stickerCollection.", new Object[0]);
                        return Boolean.valueOf(z);
                    }
                    C27072OooOO0O c27072OooOO0OOooO00o = c27538o00o0o0O.f96550OooO00o.OooO00o(str);
                    this.f96517OooOo0o = stickerCollection;
                    this.f96522OooOoo0 = 2;
                    objOooOOo = C25252OooO0Oo.OooOOo(c27072OooOO0OOooO00o, this);
                    if (objOooOOo != enumC32485OooO00o) {
                        List list4 = (List) objOooOOo;
                        String id = stickerCollection.getId();
                        this.f96517OooOo0o = stickerCollection;
                        this.f96516OooOo = list4;
                        this.f96522OooOoo0 = 3;
                        objOooO0Oo = C27538o00o0o0O.OooO0Oo(c27538o00o0o0O, id, this);
                        if (objOooO0Oo != enumC32485OooO00o) {
                            stickerCollection2 = stickerCollection;
                            list = list4;
                            this.f96517OooOo0o = stickerCollection2;
                            this.f96516OooOo = list;
                            this.f96522OooOoo0 = 4;
                            objOooO00o = C27538o00o0o0O.OooO00o(c27538o00o0o0O, this.f96524OooOooo, (File) objOooO0Oo, this);
                            if (objOooO00o != enumC32485OooO00o) {
                                List list5 = (List) objOooO00o;
                                List<CopyUriToStickerFileResult> list6 = list5;
                                arrayList = new ArrayList(C34428OooOOo.OooOOoo(list6, 10));
                                for (CopyUriToStickerFileResult copyUriToStickerFileResult : list6) {
                                    arrayList.add(new Sticker(copyUriToStickerFileResult.getStickerId(), this.f96523OooOooO, copyUriToStickerFileResult.getDstPath(), 0L, false, copyUriToStickerFileResult.getSvgAspectRatio(), 16, null));
                                }
                                interfaceC27321Oooo0o = c27538o00o0o0O.f96550OooO00o;
                                this.f96517OooOo0o = stickerCollection2;
                                this.f96516OooOo = list;
                                this.f96519OooOoO0 = list5;
                                this.f96522OooOoo0 = 5;
                                if (interfaceC27321Oooo0o.OooOOO(arrayList, this) != enumC32485OooO00o) {
                                    stickerCollection3 = stickerCollection2;
                                    list2 = list5;
                                    list3 = list;
                                    List list7 = list3;
                                    iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list7, 10));
                                    if (iOooO0Oo < 16) {
                                        iOooO0Oo = 16;
                                    }
                                    LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO0Oo);
                                    for (Object obj2 : list7) {
                                        linkedHashMap.put(Uri.fromFile(new File(((Sticker) obj2).getPath())), obj2);
                                    }
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                                        if (this.f96527Oooo00o.contains((Uri) entry.getKey())) {
                                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                                        }
                                    }
                                    ArrayList arrayList4 = new ArrayList(linkedHashMap2.size());
                                    it = linkedHashMap2.entrySet().iterator();
                                    while (it.hasNext()) {
                                        arrayList4.add((Sticker) ((Map.Entry) it.next()).getValue());
                                    }
                                    arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList4, 10));
                                    it2 = arrayList4.iterator();
                                    while (it2.hasNext()) {
                                        arrayList2.add(((Sticker) it2.next()).getId());
                                    }
                                    interfaceC27321Oooo0o2 = c27538o00o0o0O.f96550OooO00o;
                                    this.f96517OooOo0o = stickerCollection3;
                                    this.f96516OooOo = list3;
                                    this.f96519OooOoO0 = list2;
                                    this.f96518OooOoO = arrayList4;
                                    this.f96520OooOoOO = arrayList2;
                                    this.f96522OooOoo0 = 6;
                                    if (interfaceC27321Oooo0o2.OooO0oo(arrayList2, str, this) != enumC32485OooO00o) {
                                        arrayList3 = arrayList4;
                                        it3 = arrayList3.iterator();
                                        while (it3.hasNext()) {
                                            new File(((Sticker) it3.next()).getPath()).delete();
                                        }
                                        ArrayList<Sticker> arrayList5 = new ArrayList();
                                        for (Object obj3 : list3) {
                                            if (!arrayList2.contains(((Sticker) obj3).getId())) {
                                                arrayList5.add(obj3);
                                            }
                                        }
                                        iOooO0Oo2 = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(arrayList5, 10));
                                        if (iOooO0Oo2 < 16) {
                                            iOooO0Oo2 = 16;
                                        }
                                        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iOooO0Oo2);
                                        for (Sticker sticker : arrayList5) {
                                            linkedHashMap3.put(Uri.fromFile(new File(sticker.getPath())), sticker.getId());
                                        }
                                        List<CopyUriToStickerFileResult> list8 = list2;
                                        int iOooO0Oo3 = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list8, 10));
                                        LinkedHashMap linkedHashMap4 = new LinkedHashMap(iOooO0Oo3 >= 16 ? iOooO0Oo3 : 16);
                                        for (CopyUriToStickerFileResult copyUriToStickerFileResult2 : list8) {
                                            linkedHashMap4.put(copyUriToStickerFileResult2.getSrcUri(), copyUriToStickerFileResult2.getStickerId());
                                        }
                                        List<Uri> list9 = this.f96525Oooo000;
                                        ArrayList arrayList6 = new ArrayList();
                                        for (Uri uri : list9) {
                                            String str2 = (String) linkedHashMap3.get(uri);
                                            if (str2 == null) {
                                                str2 = (String) linkedHashMap4.get(uri);
                                            }
                                            if (str2 != null) {
                                                arrayList6.add(str2);
                                            }
                                        }
                                        StickerCollection stickerCollectionCopy$default = StickerCollection.copy$default(stickerCollection3, null, null, this.f96526Oooo00O, arrayList6, false, 0L, System.currentTimeMillis(), 0, 179, null);
                                        InterfaceC27321Oooo0o interfaceC27321Oooo0o4 = c27538o00o0o0O.f96550OooO00o;
                                        this.f96517OooOo0o = null;
                                        this.f96516OooOo = null;
                                        this.f96519OooOoO0 = null;
                                        this.f96518OooOoO = null;
                                        this.f96520OooOoOO = null;
                                        this.f96522OooOoo0 = 7;
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                return enumC32485OooO00o;
            case 1:
                C32446OooOOOo.OooO0O0(obj);
                objOooO = obj;
                stickerCollection = (StickerCollection) objOooO;
                if (stickerCollection != null) {
                }
                break;
            case 2:
                stickerCollection = this.f96517OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooOOo = obj;
                List list42 = (List) objOooOOo;
                String id2 = stickerCollection.getId();
                this.f96517OooOo0o = stickerCollection;
                this.f96516OooOo = list42;
                this.f96522OooOoo0 = 3;
                objOooO0Oo = C27538o00o0o0O.OooO0Oo(c27538o00o0o0O, id2, this);
                if (objOooO0Oo != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 3:
                list = this.f96516OooOo;
                stickerCollection2 = this.f96517OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooO0Oo = obj;
                this.f96517OooOo0o = stickerCollection2;
                this.f96516OooOo = list;
                this.f96522OooOoo0 = 4;
                objOooO00o = C27538o00o0o0O.OooO00o(c27538o00o0o0O, this.f96524OooOooo, (File) objOooO0Oo, this);
                if (objOooO00o != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 4:
                list = this.f96516OooOo;
                stickerCollection2 = this.f96517OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooO00o = obj;
                List list52 = (List) objOooO00o;
                List<CopyUriToStickerFileResult> list62 = list52;
                arrayList = new ArrayList(C34428OooOOo.OooOOoo(list62, 10));
                while (r10.hasNext()) {
                }
                interfaceC27321Oooo0o = c27538o00o0o0O.f96550OooO00o;
                this.f96517OooOo0o = stickerCollection2;
                this.f96516OooOo = list;
                this.f96519OooOoO0 = list52;
                this.f96522OooOoo0 = 5;
                if (interfaceC27321Oooo0o.OooOOO(arrayList, this) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 5:
                List list10 = this.f96519OooOoO0;
                List list11 = this.f96516OooOo;
                StickerCollection stickerCollection4 = this.f96517OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                stickerCollection3 = stickerCollection4;
                list3 = list11;
                list2 = list10;
                List list72 = list3;
                iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list72, 10));
                if (iOooO0Oo < 16) {
                }
                LinkedHashMap linkedHashMap5 = new LinkedHashMap(iOooO0Oo);
                while (r2.hasNext()) {
                }
                LinkedHashMap linkedHashMap22 = new LinkedHashMap();
                while (r11.hasNext()) {
                }
                ArrayList arrayList42 = new ArrayList(linkedHashMap22.size());
                it = linkedHashMap22.entrySet().iterator();
                while (it.hasNext()) {
                }
                arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList42, 10));
                it2 = arrayList42.iterator();
                while (it2.hasNext()) {
                }
                interfaceC27321Oooo0o2 = c27538o00o0o0O.f96550OooO00o;
                this.f96517OooOo0o = stickerCollection3;
                this.f96516OooOo = list3;
                this.f96519OooOoO0 = list2;
                this.f96518OooOoO = arrayList42;
                this.f96520OooOoOO = arrayList2;
                this.f96522OooOoo0 = 6;
                if (interfaceC27321Oooo0o2.OooO0oo(arrayList2, str, this) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 6:
                arrayList2 = this.f96520OooOoOO;
                arrayList3 = this.f96518OooOoO;
                list2 = this.f96519OooOoO0;
                list3 = this.f96516OooOo;
                stickerCollection3 = this.f96517OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                }
                ArrayList<Sticker> arrayList52 = new ArrayList();
                while (r9.hasNext()) {
                }
                iOooO0Oo2 = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(arrayList52, 10));
                if (iOooO0Oo2 < 16) {
                }
                LinkedHashMap linkedHashMap32 = new LinkedHashMap(iOooO0Oo2);
                while (r2.hasNext()) {
                }
                List<CopyUriToStickerFileResult> list82 = list2;
                int iOooO0Oo32 = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list82, 10));
                LinkedHashMap linkedHashMap42 = new LinkedHashMap(iOooO0Oo32 >= 16 ? iOooO0Oo32 : 16);
                while (r4.hasNext()) {
                }
                List<Uri> list92 = this.f96525Oooo000;
                ArrayList arrayList62 = new ArrayList();
                while (r4.hasNext()) {
                }
                StickerCollection stickerCollectionCopy$default2 = StickerCollection.copy$default(stickerCollection3, null, null, this.f96526Oooo00O, arrayList62, false, 0L, System.currentTimeMillis(), 0, 179, null);
                InterfaceC27321Oooo0o interfaceC27321Oooo0o42 = c27538o00o0o0O.f96550OooO00o;
                this.f96517OooOo0o = null;
                this.f96516OooOo = null;
                this.f96519OooOoO0 = null;
                this.f96518OooOoO = null;
                this.f96520OooOoOO = null;
                this.f96522OooOoo0 = 7;
                break;
            case 7:
                C32446OooOOOo.OooO0O0(obj);
                return Boolean.valueOf(z);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
