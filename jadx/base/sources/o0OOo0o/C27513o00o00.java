package o0OOo0o;

import android.net.Uri;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.sticker.CopyUriToStickerFileResult;
import com.orion.notein.domain.models.sticker.Sticker;
import com.orion.notein.domain.models.sticker.StickerCollection;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24034Oooo00O;
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
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0OOo0o.o00o00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.StickerUseCase$addStickersToStickerCollection$2", m80623f = "StickerUseCase.kt", m80624l = {237, 242, 243, 257, StyleIdentifier.SUBTLE_REFERENCE, StyleIdentifier.TABLE_GRID_LIGHT}, m80625m = "invokeSuspend")
public final class C27513o00o00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f96424OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f96425OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public ArrayList f96426OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public StickerCollection f96427OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f96428OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ String f96429OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C27538o00o0o0O f96430OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ List<Uri> f96431OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C27513o00o00(C27538o00o0o0O c27538o00o0o0O, String str, List<? extends Uri> list, Continuation<? super C27513o00o00> continuation) {
        super(2, continuation);
        this.f96430OooOoo0 = c27538o00o0o0O;
        this.f96429OooOoo = str;
        this.f96431OooOooO = list;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27513o00o00(this.f96430OooOoo0, this.f96429OooOoo, this.f96431OooOooO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C27513o00o00) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x01c7, code lost:
    
        if (r9.OooOO0O(r0, r23) != r2) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x025b, code lost:
    
        if (r4.OooOO0O(r0, r23) == r2) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094 A[Catch: Exception -> 0x0053, TRY_ENTER, TryCatch #3 {Exception -> 0x0053, blocks: (B:16:0x004d, B:36:0x00ba, B:37:0x00cc, B:39:0x00d2, B:21:0x0061, B:33:0x00a7, B:30:0x0094, B:73:0x01d6, B:74:0x01dd), top: B:92:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba A[Catch: Exception -> 0x0053, PHI: r0 r8 r9
      0x00ba: PHI (r0v23 java.lang.Object) = (r0v19 java.lang.Object), (r0v33 java.lang.Object) binds: [B:34:0x00b6, B:17:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x00ba: PHI (r8v10 com.orion.notein.domain.models.sticker.StickerCollection) = 
      (r8v7 com.orion.notein.domain.models.sticker.StickerCollection)
      (r8v12 com.orion.notein.domain.models.sticker.StickerCollection)
     binds: [B:34:0x00b6, B:17:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x00ba: PHI (r9v7 kotlin.jvm.internal.Oooo00O) = (r9v4 kotlin.jvm.internal.Oooo00O), (r9v9 kotlin.jvm.internal.Oooo00O) binds: [B:34:0x00b6, B:17:0x0050] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {Exception -> 0x0053, blocks: (B:16:0x004d, B:36:0x00ba, B:37:0x00cc, B:39:0x00d2, B:21:0x0061, B:33:0x00a7, B:30:0x0094, B:73:0x01d6, B:74:0x01dd), top: B:92:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d2 A[Catch: Exception -> 0x0053, LOOP:2: B:37:0x00cc->B:39:0x00d2, LOOP_END, TRY_LEAVE, TryCatch #3 {Exception -> 0x0053, blocks: (B:16:0x004d, B:36:0x00ba, B:37:0x00cc, B:39:0x00d2, B:21:0x0061, B:33:0x00a7, B:30:0x0094, B:73:0x01d6, B:74:0x01dd), top: B:92:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f8 A[Catch: Exception -> 0x012c, LOOP:3: B:42:0x00f2->B:44:0x00f8, LOOP_END, TryCatch #2 {Exception -> 0x012c, blocks: (B:41:0x00e0, B:42:0x00f2, B:44:0x00f8, B:47:0x0130, B:48:0x0140, B:50:0x0146, B:51:0x0154), top: B:93:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0146 A[Catch: Exception -> 0x012c, LOOP:4: B:48:0x0140->B:50:0x0146, LOOP_END, TryCatch #2 {Exception -> 0x012c, blocks: (B:41:0x00e0, B:42:0x00f2, B:44:0x00f8, B:47:0x0130, B:48:0x0140, B:50:0x0146, B:51:0x0154), top: B:93:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d6 A[Catch: Exception -> 0x0053, TRY_ENTER, TryCatch #3 {Exception -> 0x0053, blocks: (B:16:0x004d, B:36:0x00ba, B:37:0x00cc, B:39:0x00d2, B:21:0x0061, B:33:0x00a7, B:30:0x0094, B:73:0x01d6, B:74:0x01dd), top: B:92:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0182 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v15, types: [T, java.util.ArrayList] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list;
        C24034Oooo00O c24034Oooo00O;
        StickerCollection stickerCollection;
        C24034Oooo00O c24034Oooo00O2;
        Object objOooO;
        Object objOooO0Oo;
        Object objOooO00o;
        ArrayList arrayList;
        Iterator it;
        ArrayList arrayList2;
        Iterator it2;
        InterfaceC27321Oooo0o interfaceC27321Oooo0o;
        ArrayList arrayList3;
        C24034Oooo00O c24034Oooo00O3;
        ArrayList arrayList4;
        Iterator it3;
        List list2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96428OooOoOO;
        boolean z = false;
        C27538o00o0o0O c27538o00o0o0O = this.f96430OooOoo0;
        try {
            try {
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
            list = null;
        }
        switch (i) {
            case 0:
                C32446OooOOOo.OooO0O0(obj);
                c24034Oooo00O2 = new C24034Oooo00O();
                String strOooO0Oo = c27538o00o0o0O.f96551OooO0O0.OooO0Oo();
                this.f96425OooOo0o = c24034Oooo00O2;
                this.f96428OooOoOO = 1;
                objOooO = c27538o00o0o0O.f96550OooO00o.OooO(this.f96429OooOoo, strOooO0Oo, this);
                if (objOooO != enumC32485OooO00o) {
                    c24034Oooo00O = c24034Oooo00O2;
                    stickerCollection = (StickerCollection) objOooO;
                    if (stickerCollection != null) {
                        throw new IllegalArgumentException("stickerCollection not found.");
                    }
                    String id = stickerCollection.getId();
                    this.f96425OooOo0o = c24034Oooo00O;
                    this.f96424OooOo = stickerCollection;
                    this.f96428OooOoOO = 2;
                    objOooO0Oo = C27538o00o0o0O.OooO0Oo(c27538o00o0o0O, id, this);
                    if (objOooO0Oo != enumC32485OooO00o) {
                        List<Uri> list3 = this.f96431OooOooO;
                        this.f96425OooOo0o = c24034Oooo00O;
                        this.f96424OooOo = stickerCollection;
                        this.f96428OooOoOO = 3;
                        objOooO00o = C27538o00o0o0O.OooO00o(c27538o00o0o0O, list3, (File) objOooO0Oo, this);
                        if (objOooO00o == enumC32485OooO00o) {
                            List list4 = (List) objOooO00o;
                            List list5 = list4;
                            arrayList = new ArrayList(C34428OooOOo.OooOOoo(list5, 10));
                            it = list5.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((CopyUriToStickerFileResult) it.next()).getDstPath());
                            }
                            try {
                                List<CopyUriToStickerFileResult> list6 = list4;
                                String str = this.f96429OooOoo;
                                ArrayList arrayList5 = new ArrayList(C34428OooOOo.OooOOoo(list6, 10));
                                for (CopyUriToStickerFileResult copyUriToStickerFileResult : list6) {
                                    ArrayList arrayList6 = arrayList5;
                                    arrayList6.add(new Sticker(copyUriToStickerFileResult.getStickerId(), str, copyUriToStickerFileResult.getDstPath(), 0L, false, copyUriToStickerFileResult.getSvgAspectRatio(), 16, null));
                                    arrayList5 = arrayList6;
                                }
                                arrayList2 = arrayList5;
                                List list7 = list4;
                                ?? arrayList7 = new ArrayList(C34428OooOOo.OooOOoo(list7, 10));
                                it2 = list7.iterator();
                                while (it2.hasNext()) {
                                    arrayList7.add(((CopyUriToStickerFileResult) it2.next()).getStickerId());
                                }
                                c24034Oooo00O.f80942OooOo0o = arrayList7;
                                interfaceC27321Oooo0o = c27538o00o0o0O.f96550OooO00o;
                                this.f96425OooOo0o = arrayList;
                                this.f96424OooOo = c24034Oooo00O;
                                this.f96427OooOoO0 = stickerCollection;
                                this.f96426OooOoO = arrayList2;
                                this.f96428OooOoOO = 4;
                                if (interfaceC27321Oooo0o.OooOOO(arrayList2, this) != enumC32485OooO00o) {
                                    arrayList3 = arrayList2;
                                    list = arrayList;
                                    c24034Oooo00O3 = c24034Oooo00O;
                                    try {
                                        arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(arrayList3, 10));
                                        it3 = arrayList3.iterator();
                                        while (it3.hasNext()) {
                                            try {
                                                arrayList4.add(((Sticker) it3.next()).getId());
                                            } catch (Exception e3) {
                                                e = e3;
                                                c24034Oooo00O = c24034Oooo00O3;
                                                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                                                c20358OooO00o.OooOOO0("StickerUseCase");
                                                c20358OooO00o.OooO0Oo(e, "addStickersToStickerCollection error.", new Object[0]);
                                                if (list != null) {
                                                    List list8 = list;
                                                    ArrayList arrayList8 = new ArrayList(C34428OooOOo.OooOOoo(list8, 10));
                                                    Iterator it4 = list8.iterator();
                                                    while (it4.hasNext()) {
                                                        arrayList8.add(Boolean.valueOf(new File((String) it4.next()).delete()));
                                                    }
                                                }
                                                if (stickerCollection != null) {
                                                    List<String> children = stickerCollection.getChildren();
                                                    Iterable iterable = (List) c24034Oooo00O.f80942OooOo0o;
                                                    if (iterable == null) {
                                                        iterable = C34434OooOoO.f123453OooOo0o;
                                                    }
                                                    StickerCollection stickerCollectionCopy$default = StickerCollection.copy$default(stickerCollection, null, null, null, oOo000Oo.OooOo.Ooooo00(children, oOo000Oo.OooOo.o0OO00O(iterable)), false, 0L, 0L, 0, StyleIdentifier.LIGHT_LIST_ACCENT_6, null);
                                                    InterfaceC27321Oooo0o interfaceC27321Oooo0o2 = c27538o00o0o0O.f96550OooO00o;
                                                    this.f96425OooOo0o = null;
                                                    this.f96424OooOo = null;
                                                    this.f96427OooOoO0 = null;
                                                    this.f96426OooOoO = null;
                                                    this.f96428OooOoOO = 6;
                                                    break;
                                                }
                                                return Boolean.valueOf(z);
                                            }
                                        }
                                        list2 = list;
                                    } catch (Exception e4) {
                                        e = e4;
                                    }
                                    try {
                                        StickerCollection stickerCollectionCopy$default2 = StickerCollection.copy$default(stickerCollection, null, null, null, oOo000Oo.OooOo.OooooOO(arrayList4, stickerCollection.getChildren()), false, 0L, 0L, 0, StyleIdentifier.LIGHT_LIST_ACCENT_6, null);
                                        InterfaceC27321Oooo0o interfaceC27321Oooo0o3 = c27538o00o0o0O.f96550OooO00o;
                                        this.f96425OooOo0o = list2;
                                        this.f96424OooOo = c24034Oooo00O3;
                                        this.f96427OooOoO0 = stickerCollection;
                                        this.f96426OooOoO = null;
                                        this.f96428OooOoOO = 5;
                                        break;
                                    } catch (Exception e5) {
                                        e = e5;
                                        c24034Oooo00O = c24034Oooo00O3;
                                        list = list2;
                                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                                        c20358OooO00o2.OooOOO0("StickerUseCase");
                                        c20358OooO00o2.OooO0Oo(e, "addStickersToStickerCollection error.", new Object[0]);
                                        if (list != null) {
                                        }
                                        if (stickerCollection != null) {
                                        }
                                    }
                                }
                            } catch (Exception e6) {
                                e = e6;
                                list = arrayList;
                                C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o22.OooOOO0("StickerUseCase");
                                c20358OooO00o22.OooO0Oo(e, "addStickersToStickerCollection error.", new Object[0]);
                                if (list != null) {
                                }
                                if (stickerCollection != null) {
                                }
                                return Boolean.valueOf(z);
                            }
                        }
                    }
                }
                return enumC32485OooO00o;
            case 1:
                c24034Oooo00O2 = (C24034Oooo00O) this.f96425OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooO = obj;
                c24034Oooo00O = c24034Oooo00O2;
                stickerCollection = (StickerCollection) objOooO;
                if (stickerCollection != null) {
                }
                break;
            case 2:
                stickerCollection = (StickerCollection) this.f96424OooOo;
                c24034Oooo00O = (C24034Oooo00O) this.f96425OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooO0Oo = obj;
                List<Uri> list32 = this.f96431OooOooO;
                this.f96425OooOo0o = c24034Oooo00O;
                this.f96424OooOo = stickerCollection;
                this.f96428OooOoOO = 3;
                objOooO00o = C27538o00o0o0O.OooO00o(c27538o00o0o0O, list32, (File) objOooO0Oo, this);
                if (objOooO00o == enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 3:
                stickerCollection = (StickerCollection) this.f96424OooOo;
                c24034Oooo00O = (C24034Oooo00O) this.f96425OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooO00o = obj;
                List list42 = (List) objOooO00o;
                List list52 = list42;
                arrayList = new ArrayList(C34428OooOOo.OooOOoo(list52, 10));
                it = list52.iterator();
                while (it.hasNext()) {
                }
                List<CopyUriToStickerFileResult> list62 = list42;
                String str2 = this.f96429OooOoo;
                ArrayList arrayList52 = new ArrayList(C34428OooOOo.OooOOoo(list62, 10));
                while (r10.hasNext()) {
                }
                arrayList2 = arrayList52;
                List list72 = list42;
                ?? arrayList72 = new ArrayList(C34428OooOOo.OooOOoo(list72, 10));
                it2 = list72.iterator();
                while (it2.hasNext()) {
                }
                c24034Oooo00O.f80942OooOo0o = arrayList72;
                interfaceC27321Oooo0o = c27538o00o0o0O.f96550OooO00o;
                this.f96425OooOo0o = arrayList;
                this.f96424OooOo = c24034Oooo00O;
                this.f96427OooOoO0 = stickerCollection;
                this.f96426OooOoO = arrayList2;
                this.f96428OooOoOO = 4;
                if (interfaceC27321Oooo0o.OooOOO(arrayList2, this) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 4:
                arrayList3 = this.f96426OooOoO;
                stickerCollection = this.f96427OooOoO0;
                c24034Oooo00O = (C24034Oooo00O) this.f96424OooOo;
                list = (List) this.f96425OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                c24034Oooo00O3 = c24034Oooo00O;
                arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(arrayList3, 10));
                it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                }
                list2 = list;
                StickerCollection stickerCollectionCopy$default22 = StickerCollection.copy$default(stickerCollection, null, null, null, oOo000Oo.OooOo.OooooOO(arrayList4, stickerCollection.getChildren()), false, 0L, 0L, 0, StyleIdentifier.LIGHT_LIST_ACCENT_6, null);
                InterfaceC27321Oooo0o interfaceC27321Oooo0o32 = c27538o00o0o0O.f96550OooO00o;
                this.f96425OooOo0o = list2;
                this.f96424OooOo = c24034Oooo00O3;
                this.f96427OooOoO0 = stickerCollection;
                this.f96426OooOoO = null;
                this.f96428OooOoOO = 5;
                break;
            case 5:
                StickerCollection stickerCollection2 = this.f96427OooOoO0;
                C32446OooOOOo.OooO0O0(obj);
                z = true;
                return Boolean.valueOf(z);
            case 6:
                C32446OooOOOo.OooO0O0(obj);
                return Boolean.valueOf(z);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
