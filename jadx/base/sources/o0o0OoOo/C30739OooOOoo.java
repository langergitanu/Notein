package o0o0OoOo;

import android.os.SystemClock;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.page.Stroke;
import com.orion.penkit.models.DrawRecord;
import com.orion.penkit.models.InkStrokeInfo;
import com.orion.penkit.models.PressurePoint;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27449o00O0OoO;
import o0OOo0o.o00OO0;
import o0o0OoOo.C30722OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0o0OoOo.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.debug.viewmodel.DebugViewModel$measureFirstPageStrokeLoad$2", m80623f = "DebugViewModel.kt", m80624l = {StyleIdentifier.GRID_TABLE_3_ACCENT_5, StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_5}, m80625m = "invokeSuspend")
public final class C30739OooOOoo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C30722OooO00o.C20122OooO00o>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public long f109934OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f109935OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C30722OooO00o f109936OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f109937OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f109938OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30739OooOOoo(C30722OooO00o c30722OooO00o, String str, Continuation<? super C30739OooOOoo> continuation) {
        super(2, continuation);
        this.f109936OooOoO = c30722OooO00o;
        this.f109938OooOoOO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30739OooOOoo(this.f109936OooOoO, this.f109938OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C30722OooO00o.C20122OooO00o> continuation) {
        return ((C30739OooOOoo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<Page> pages;
        Page page;
        String id;
        String str;
        long j;
        androidx.ink.strokes.OooOOO0 stroke;
        androidx.ink.strokes.OooO00o oooO00o;
        List<PressurePoint> points;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f109937OooOoO0;
        String str2 = this.f109938OooOoOO;
        C27449o00O0OoO c27449o00O0OoO = this.f109936OooOoO.f109866OooOO0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f109937OooOoO0 = 1;
            obj = c27449o00O0OoO.OooOoO0(str2, this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.f109934OooOo;
            String str3 = this.f109935OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            str = str3;
            List<Stroke> list = (List) obj;
            int iOooO0OO = 0;
            for (Stroke stroke2 : list) {
                DrawRecord record = stroke2.getRecord();
                int size = (record == null || (points = record.getPoints()) == null) ? 0 : points.size();
                InkStrokeInfo inkStroke = stroke2.getInkStroke();
                iOooO0OO += size + ((inkStroke == null || (stroke = inkStroke.getStroke()) == null || (oooO00o = stroke.f65488OooO0OO) == null) ? 0 : oooO00o.OooO0OO());
            }
            return new C30722OooO00o.C20122OooO00o(str2, str, list.size(), iOooO0OO, SystemClock.elapsedRealtime() - j);
        }
        C32446OooOOOo.OooO0O0(obj);
        NoteContent noteContent = (NoteContent) obj;
        if (noteContent == null || (pages = noteContent.getPages()) == null || (page = (Page) oOo000Oo.OooOo.Oooo(pages)) == null || (id = page.getId()) == null) {
            return null;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f109935OooOo0o = id;
        this.f109934OooOo = jElapsedRealtime;
        this.f109937OooOoO0 = 2;
        c27449o00O0OoO.getClass();
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o00OO0(id, str2, null, c27449o00O0OoO), this);
        if (objOooO0o != enumC32485OooO00o) {
            str = id;
            obj = objOooO0o;
            j = jElapsedRealtime;
            List<Stroke> list2 = (List) obj;
            int iOooO0OO2 = 0;
            while (r2.hasNext()) {
            }
            return new C30722OooO00o.C20122OooO00o(str2, str, list2.size(), iOooO0OO2, SystemClock.elapsedRealtime() - j);
        }
        return enumC32485OooO00o;
    }
}
