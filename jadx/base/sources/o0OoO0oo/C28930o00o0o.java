package o0OoO0oo;

import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.p607ui.noteeditor.C23344OooOOo;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27449o00O0OoO;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OoO0oo.o00o0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorViewModel$rotatePages$2", m80623f = "NoteEditorViewModel.kt", m80624l = {1831, 1869, 1876, 1882, 1886, 1889}, m80625m = "invokeSuspend")
public final class C28930o00o0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f102495OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f102496OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f102497OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Page.RotationDirection f102498OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C23344OooOOo f102499OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ List<String> f102500OooOoo0;

    /* JADX INFO: renamed from: o0OoO0oo.o00o0o$OooO00o */
    public /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f102501OooO00o;

        static {
            int[] iArr = new int[Page.RotationDirection.values().length];
            try {
                iArr[Page.RotationDirection.ROTATION_0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Page.RotationDirection.CLOCKWISE_90.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Page.RotationDirection.ROTATION_180.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Page.RotationDirection.CLOCKWISE_270.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f102501OooO00o = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28930o00o0o(Page.RotationDirection rotationDirection, String str, C23344OooOOo c23344OooOOo, List<String> list, Continuation<? super C28930o00o0o> continuation) {
        super(2, continuation);
        this.f102498OooOoO0 = rotationDirection;
        this.f102497OooOoO = str;
        this.f102499OooOoOO = c23344OooOOo;
        this.f102500OooOoo0 = list;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28930o00o0o(this.f102498OooOoO0, this.f102497OooOoO, this.f102499OooOoOO, this.f102500OooOoo0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28930o00o0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x020a, code lost:
    
        if (r2 == r1) goto L96;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015b A[PHI: r2
      0x015b: PHI (r2v17 java.util.Map) = (r2v14 java.util.Map), (r2v23 java.util.Map) binds: [B:65:0x0157, B:9:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019a A[PHI: r2
      0x019a: PHI (r2v24 java.lang.Object) = (r2v21 java.lang.Object), (r2v27 java.lang.Object) binds: [B:79:0x0196, B:8:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f3  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooo00o;
        int iOooO0Oo;
        List listO0ooOO0;
        List listO0ooOO02;
        Map map;
        Set setO0OO00O;
        Page page;
        String id;
        Object objOooO0Oo;
        Page page2;
        C32443OooOOO<Integer, Integer> tnSize;
        Object objOooOoOO;
        NoteMeta noteMetaCopy$default;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102495OooOo;
        Page.RotationDirection rotationDirection = this.f102498OooOoO0;
        C23344OooOOo c23344OooOOo = this.f102499OooOoOO;
        C27449o00O0OoO c27449o00O0OoO = c23344OooOOo.f73545OooO0Oo;
        String str = this.f102497OooOoO;
        switch (i) {
            case 0:
                C32446OooOOOo.OooO0O0(obj);
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("NoteEditorViewModel");
                c20358OooO00o.OooO0o0("rotateNote, direction: " + rotationDirection + ", noteId: " + str, new Object[0]);
                this.f102495OooOo = 1;
                objOooo00o = c27449o00O0OoO.Oooo00o(str, this.f102500OooOoo0, this);
                if (objOooo00o != enumC32485OooO00o) {
                    List<Page> list = (List) objOooo00o;
                    iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list, 10));
                    if (iOooO0Oo < 16) {
                        iOooO0Oo = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO0Oo);
                    for (Page page3 : list) {
                        Page.RotationDirection rotationDirection2 = page3.getRotationDirection();
                        int[] iArr = OooO00o.f102501OooO00o;
                        int i2 = iArr[rotationDirection.ordinal()];
                        if (i2 == 2) {
                            int i3 = iArr[rotationDirection2.ordinal()];
                            if (i3 == 1) {
                                rotationDirection2 = Page.RotationDirection.CLOCKWISE_90;
                            } else if (i3 == 2) {
                                rotationDirection2 = Page.RotationDirection.ROTATION_180;
                            } else if (i3 == 3) {
                                rotationDirection2 = Page.RotationDirection.CLOCKWISE_270;
                            } else {
                                if (i3 != 4) {
                                    throw new C32442OooOO0o();
                                }
                                rotationDirection2 = Page.RotationDirection.ROTATION_0;
                            }
                        } else if (i2 == 3) {
                            int i4 = iArr[rotationDirection2.ordinal()];
                            if (i4 == 1) {
                                rotationDirection2 = Page.RotationDirection.ROTATION_180;
                            } else if (i4 == 2) {
                                rotationDirection2 = Page.RotationDirection.CLOCKWISE_270;
                            } else if (i4 == 3) {
                                rotationDirection2 = Page.RotationDirection.ROTATION_0;
                            } else {
                                if (i4 != 4) {
                                    throw new C32442OooOO0o();
                                }
                                rotationDirection2 = Page.RotationDirection.CLOCKWISE_90;
                            }
                        } else if (i2 == 4) {
                            int i5 = iArr[rotationDirection2.ordinal()];
                            if (i5 == 1) {
                                rotationDirection2 = Page.RotationDirection.CLOCKWISE_270;
                            } else if (i5 == 2) {
                                rotationDirection2 = Page.RotationDirection.ROTATION_0;
                            } else if (i5 == 3) {
                                rotationDirection2 = Page.RotationDirection.CLOCKWISE_90;
                            } else {
                                if (i5 != 4) {
                                    throw new C32442OooOO0o();
                                }
                                rotationDirection2 = Page.RotationDirection.ROTATION_180;
                            }
                        } else {
                            continue;
                        }
                        linkedHashMap.put(page3.getId(), rotationDirection2);
                    }
                    listO0ooOO0 = oOo000Oo.OooOo.o0ooOO0(linkedHashMap.keySet());
                    listO0ooOO02 = oOo000Oo.OooOo.o0ooOO0(linkedHashMap.values());
                    this.f102496OooOo0o = linkedHashMap;
                    this.f102495OooOo = 2;
                    if (c27449o00O0OoO.OooooO0(listO0ooOO0, listO0ooOO02, str, this) != enumC32485OooO00o) {
                        map = linkedHashMap;
                        setO0OO00O = oOo000Oo.OooOo.o0OO00O(map.keySet());
                        this.f102496OooOo0o = map;
                        this.f102495OooOo = 3;
                        if (c23344OooOOo.f73560OooOo.OooO00o(setO0OO00O, str, true, this) != enumC32485OooO00o) {
                            NoteContent noteContent = (NoteContent) c23344OooOOo.f73592OoooOoo.f121747OooOo0o.getValue();
                            page = (Page) oOo000Oo.OooOo.Oooo(noteContent.getPages());
                            if (page != null || (id = page.getId()) == null || !kotlin.jvm.internal.OooOOO0.OooO0O0(noteContent.getId(), str)) {
                                id = null;
                            }
                            if (id != null && map.containsKey(id)) {
                                this.f102496OooOo0o = null;
                                this.f102495OooOo = 4;
                                objOooO0Oo = c23344OooOOo.f73552OooOO0o.OooO0Oo(id, str, this);
                                if (objOooO0Oo != enumC32485OooO00o) {
                                    page2 = (Page) objOooO0Oo;
                                    if (page2 != null) {
                                        tnSize = page2.getTnSize();
                                        this.f102496OooOo0o = tnSize;
                                        this.f102495OooOo = 5;
                                        objOooOoOO = c27449o00O0OoO.OooOoOO(str, this);
                                        if (objOooOoOO != enumC32485OooO00o) {
                                            NoteMeta noteMeta = (NoteMeta) objOooOoOO;
                                            noteMetaCopy$default = noteMeta == null ? NoteMeta.copy$default(noteMeta, null, null, null, null, null, false, null, tnSize.f116638OooOo0o.intValue(), tnSize.f116637OooOo.intValue(), false, null, 0, 0L, 0L, null, false, false, false, 0L, 523903, null) : null;
                                            if (noteMetaCopy$default != null) {
                                                this.f102496OooOo0o = null;
                                                this.f102495OooOo = 6;
                                                Object objOooOo0O = c27449o00O0OoO.f96036OooO0O0.OooOo0O(new NoteMeta[]{noteMetaCopy$default}, this);
                                                if (objOooOo0O != EnumC32485OooO00o.f116726OooOo0o) {
                                                    objOooOo0O = C32460OooOooO.f116667OooO00o;
                                                }
                                            }
                                        }
                                    }
                                }
                                break;
                            }
                            return C32460OooOooO.f116667OooO00o;
                        }
                    }
                }
                return enumC32485OooO00o;
            case 1:
                C32446OooOOOo.OooO0O0(obj);
                objOooo00o = obj;
                List<Page> list2 = (List) objOooo00o;
                iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list2, 10));
                if (iOooO0Oo < 16) {
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iOooO0Oo);
                while (r2.hasNext()) {
                }
                listO0ooOO0 = oOo000Oo.OooOo.o0ooOO0(linkedHashMap2.keySet());
                listO0ooOO02 = oOo000Oo.OooOo.o0ooOO0(linkedHashMap2.values());
                this.f102496OooOo0o = linkedHashMap2;
                this.f102495OooOo = 2;
                if (c27449o00O0OoO.OooooO0(listO0ooOO0, listO0ooOO02, str, this) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 2:
                map = (Map) this.f102496OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                setO0OO00O = oOo000Oo.OooOo.o0OO00O(map.keySet());
                this.f102496OooOo0o = map;
                this.f102495OooOo = 3;
                if (c23344OooOOo.f73560OooOo.OooO00o(setO0OO00O, str, true, this) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 3:
                map = (Map) this.f102496OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                NoteContent noteContent2 = (NoteContent) c23344OooOOo.f73592OoooOoo.f121747OooOo0o.getValue();
                page = (Page) oOo000Oo.OooOo.Oooo(noteContent2.getPages());
                if (page != null) {
                    break;
                }
                id = null;
                if (id != null) {
                    this.f102496OooOo0o = null;
                    this.f102495OooOo = 4;
                    objOooO0Oo = c23344OooOOo.f73552OooOO0o.OooO0Oo(id, str, this);
                    if (objOooO0Oo != enumC32485OooO00o) {
                    }
                    return enumC32485OooO00o;
                }
                return C32460OooOooO.f116667OooO00o;
            case 4:
                C32446OooOOOo.OooO0O0(obj);
                objOooO0Oo = obj;
                page2 = (Page) objOooO0Oo;
                if (page2 != null) {
                }
                return C32460OooOooO.f116667OooO00o;
            case 5:
                tnSize = (C32443OooOOO) this.f102496OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooOoOO = obj;
                NoteMeta noteMeta2 = (NoteMeta) objOooOoOO;
                if (noteMeta2 == null) {
                }
                if (noteMetaCopy$default != null) {
                }
                return C32460OooOooO.f116667OooO00o;
            case 6:
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
