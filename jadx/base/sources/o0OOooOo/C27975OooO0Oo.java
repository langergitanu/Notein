package o0OOooOo;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.note.PenInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.coroutines.Continuation;
import o000oooo.C24761OooO;
import o0OO.C26433OoooO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0OOooOo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.penbar.UpdatePenInfoUseCase$updatePenInfo$2", m80623f = "UpdatePenInfoUseCase.kt", m80624l = {106}, m80625m = "invokeSuspend")
public final class C27975OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ List<PenInfo> f99186OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f99187OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f99188OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ PenInfo f99189OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ boolean f99190OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C27976OooO0o0 f99191OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27975OooO0Oo(List<PenInfo> list, PenInfo penInfo, String str, boolean z, C27976OooO0o0 c27976OooO0o0, Continuation<? super C27975OooO0Oo> continuation) {
        super(2, continuation);
        this.f99186OooOo = list;
        this.f99189OooOoO0 = penInfo;
        this.f99188OooOoO = str;
        this.f99190OooOoOO = z;
        this.f99191OooOoo0 = c27976OooO0o0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27975OooO0Oo(this.f99186OooOo, this.f99189OooOoO0, this.f99188OooOoO, this.f99190OooOoOO, this.f99191OooOoo0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27975OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0227  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object next;
        PenInfo penInfo;
        int i;
        Throwable th;
        C27976OooO0o0 c27976OooO0o0;
        PenInfo penInfoCopy$default;
        List<Integer> colorList;
        int colorIndex;
        List list;
        List<Float> widthList;
        int widthIndex;
        List list2;
        int widthIndex2;
        PenInfo penInfoCopy$default2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = this.f99187OooOo0o;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            List<PenInfo> list3 = this.f99186OooOo;
            Iterator<T> it = list3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((PenInfo) next).getSelected()) {
                    break;
                }
            }
            PenInfo penInfo2 = (PenInfo) next;
            for (PenInfo penInfo3 : list3) {
                int type = penInfo3.getType();
                PenInfo penInfo4 = this.f99189OooOoO0;
                if (type == penInfo4.getType()) {
                    C34406OooO00o.f123390OooO00o.OooO0o0("updatePenInfo target tool type: " + penInfo4.getType() + ", current tool type: " + (penInfo2 != null ? new Integer(penInfo2.getType()) : null), new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    if (penInfo2 == null || penInfo2.getType() == penInfo4.getType()) {
                        penInfo = penInfo4;
                        i = 0;
                        th = null;
                    } else {
                        if (penInfo2.getNoteId() == null) {
                            penInfo = penInfo4;
                            i = 0;
                            th = null;
                            penInfoCopy$default2 = PenInfo.copy$default(penInfo2, C24761OooO.OooO00o("toString(...)"), 0, 0, 0, null, null, this.f99188OooOoO, false, null, StyleIdentifier.GRID_TABLE_4_ACCENT_6, null);
                        } else {
                            penInfo = penInfo4;
                            i = 0;
                            th = null;
                            penInfoCopy$default2 = PenInfo.copy$default(penInfo2, null, 0, 0, 0, null, null, null, false, null, 383, null);
                        }
                        arrayList.add(penInfoCopy$default2);
                    }
                    boolean z = this.f99190OooOoOO;
                    C27976OooO0o0 c27976OooO0o02 = this.f99191OooOoo0;
                    if (z) {
                        c27976OooO0o02.getClass();
                        if (penInfo.getColorList().isEmpty() || penInfo3.getColorList().isEmpty()) {
                            colorList = penInfo3.getColorList();
                            colorIndex = penInfo3.getColorIndex();
                        } else {
                            int iIntValue = penInfo.getColorList().get(penInfo.getColorIndex()).intValue();
                            colorIndex = penInfo3.getColorList().indexOf(Integer.valueOf(iIntValue));
                            if (colorIndex != -1) {
                                colorList = penInfo3.getColorList();
                            } else {
                                List<Integer> colorList2 = penInfo3.getColorList();
                                ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(colorList2, 10));
                                int i3 = i;
                                for (Object obj2 : colorList2) {
                                    int i4 = i3 + 1;
                                    if (i3 < 0) {
                                        C34429OooOOo0.OooOOo();
                                        throw th;
                                    }
                                    int iIntValue2 = ((Number) obj2).intValue();
                                    if (i3 == penInfo3.getColorIndex()) {
                                        iIntValue2 = iIntValue;
                                    }
                                    arrayList2.add(Integer.valueOf(iIntValue2));
                                    i3 = i4;
                                }
                                colorIndex = penInfo3.getColorIndex();
                                list = arrayList2;
                                if (!penInfo.getWidthList().isEmpty() || penInfo3.getWidthList().isEmpty()) {
                                    widthList = penInfo3.getWidthList();
                                    widthIndex = penInfo3.getWidthIndex();
                                } else {
                                    float fFloatValue = penInfo.getWidthList().get(penInfo.getWidthIndex()).floatValue();
                                    widthIndex = penInfo3.getWidthList().indexOf(Float.valueOf(fFloatValue));
                                    if (widthIndex != -1) {
                                        widthList = penInfo3.getWidthList();
                                    } else {
                                        List<Float> widthList2 = penInfo3.getWidthList();
                                        ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(widthList2, 10));
                                        int i5 = i;
                                        for (Object obj3 : widthList2) {
                                            int i6 = i5 + 1;
                                            if (i5 < 0) {
                                                C34429OooOOo0.OooOOo();
                                                throw th;
                                            }
                                            float fFloatValue2 = ((Number) obj3).floatValue();
                                            if (i5 == penInfo3.getWidthIndex()) {
                                                fFloatValue2 = fFloatValue;
                                            }
                                            arrayList3.add(Float.valueOf(fFloatValue2));
                                            i5 = i6;
                                        }
                                        widthIndex2 = penInfo3.getWidthIndex();
                                        list2 = arrayList3;
                                        if (penInfo3.getNoteId() == null) {
                                            c27976OooO0o0 = c27976OooO0o02;
                                            penInfoCopy$default = PenInfo.copy$default(penInfo, C24761OooO.OooO00o("toString(...)"), 0, colorIndex, widthIndex2, list, list2, this.f99188OooOoO, true, null, StyleIdentifier.COLORFUL_LIST_ACCENT_6, null);
                                        } else {
                                            c27976OooO0o0 = c27976OooO0o02;
                                            penInfoCopy$default = PenInfo.copy$default(penInfo, penInfo3.getId(), 0, colorIndex, widthIndex2, list, list2, penInfo3.getNoteId(), true, null, StyleIdentifier.COLORFUL_LIST_ACCENT_6, null);
                                        }
                                    }
                                }
                                list2 = widthList;
                                widthIndex2 = widthIndex;
                                if (penInfo3.getNoteId() == null) {
                                }
                            }
                        }
                        list = colorList;
                        if (penInfo.getWidthList().isEmpty()) {
                            widthList = penInfo3.getWidthList();
                            widthIndex = penInfo3.getWidthIndex();
                            list2 = widthList;
                            widthIndex2 = widthIndex;
                            if (penInfo3.getNoteId() == null) {
                            }
                        }
                    } else {
                        c27976OooO0o0 = c27976OooO0o02;
                        penInfoCopy$default = penInfo3.getNoteId() == null ? PenInfo.copy$default(penInfo3, C24761OooO.OooO00o("toString(...)"), 0, penInfo.getColorIndex(), penInfo.getWidthIndex(), null, null, this.f99188OooOoO, true, null, StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_4, null) : PenInfo.copy$default(penInfo3, null, 0, penInfo.getColorIndex(), penInfo.getWidthIndex(), null, null, null, true, null, StyleIdentifier.SMART_LINK, null);
                    }
                    arrayList.add(penInfoCopy$default);
                    C26433OoooO0 c26433OoooO0 = c27976OooO0o0.f99193OooO0O0;
                    PenInfo[] penInfoArr = (PenInfo[]) arrayList.toArray(new PenInfo[i]);
                    PenInfo[] penInfoArr2 = (PenInfo[]) Arrays.copyOf(penInfoArr, penInfoArr.length);
                    this.f99187OooOo0o = 1;
                    if (c26433OoooO0.OooO0O0(penInfoArr2, this) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C32446OooOOOo.OooO0O0(obj);
        return C32460OooOooO.f116667OooO00o;
    }
}
