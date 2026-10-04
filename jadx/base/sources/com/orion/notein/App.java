package com.orion.notein;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Environment;
import androidx.work.OooO00o;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.firebase.Firebase;
import com.google.firebase.FirebaseKt;
import com.google.firebase.appcheck.FirebaseAppCheckKt;
import com.google.firebase.appcheck.playintegrity.PlayIntegrityAppCheckProviderFactory;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.network.embedded.C18374u4;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.orion.ni_render_engine.impl.ink.BrushFamilyProvider;
import com.orion.ni_render_engine.impl.ink.C22841OooO0o0;
import com.orion.ni_render_engine.impl.ink.OooO0O0;
import com.orion.ni_render_engine.impl.ink.OooO0OO;
import com.orion.notein.richeditor.api.RTApi;
import com.orion.notein.richeditor.fonts.FontManager;
import com.orion.penkit.tools.DrawToolFactory;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import o00000.OooOO0;
import o00000O.OooO0O0;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24340OooO0oo;
import o000O0o0.C24408OooO00o;
import o00o00O0.C25252OooO0Oo;
import o00o0o00.C25438OooO00o;
import o00o0o00.C25439OooO0O0;
import o00oo000.C25643OooO0O0;
import o00oo000.C25646OooO0o0;
import o00oo0Oo.C25700OooOOo;
import o00oo0Oo.C25703OooOo0;
import o00ooO.C25732OooO0O0;
import o00ooOo0.C25787OooO00o;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0O0oooO.C26253OooO0O0;
import o0O0oooO.C26254OooO0OO;
import o0O0oooO.C26255OooO0Oo;
import o0O0oooO.C26257OooO0o0;
import o0O0oooO.C26275OooOoO;
import o0OOo0oo.C27618OooO0oO;
import o0OOo0oo.C27620OooOO0;
import o0Oo0O00.C28051OooO00o;
import o0Oo0OOO.C28081OooOO0;
import o0oo0OoO.C31270OooO0OO;
import o0oo0OoO.C31277OooOO0O;
import o0oo0Ooo.C31279OooO0O0;
import o0ooO00o.C31428OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.C33664o00000Oo;
import oO0o0OO.o00000OO;
import oO0o0OOO.AbstractC33687OooO0oO;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Ooo.C33833OooOOOO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo0000O.InterfaceC34415OooO0oo;
import oOo000Oo.C34431OooOo0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m80612d2 = {"Lcom/orion/notein/App;", "Landroid/app/Application;", "Landroidx/work/OooO00o$OooO0O0;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public class App extends AbstractApplicationC26277OooOoOO implements OooO00o.OooO0O0 {

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Integer> f69572Oooooo;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Boolean> f69574OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Boolean> f69575Ooooooo;

    /* JADX INFO: renamed from: o00000, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<String> f69576o00000;

    /* JADX INFO: renamed from: o000000, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Boolean> f69577o000000;

    /* JADX INFO: renamed from: o000000O, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Boolean> f69578o000000O;

    /* JADX INFO: renamed from: o000000o, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Float> f69579o000000o;

    /* JADX INFO: renamed from: o00000O, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Boolean> f69580o00000O;

    /* JADX INFO: renamed from: o00000O0, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Boolean> f69581o00000O0;

    /* JADX INFO: renamed from: o00000OO, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Boolean> f69582o00000OO;

    /* JADX INFO: renamed from: o00000Oo, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Boolean> f69583o00000Oo;

    /* JADX INFO: renamed from: o00000o0, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Boolean> f69584o00000o0;

    /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Boolean> f69585o000OOo;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Boolean> f69587o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Float> f69588o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Boolean> f69589o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Boolean> f69590o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Boolean> f69591o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Boolean> f69592o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Boolean> f69593o00ooo;

    /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Boolean> f69594o0O0O00;

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Boolean> f69595o0OO00O;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<String> f69596o0OOO0o;

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Boolean> f69597o0Oo0oo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Boolean> f69598o0OoOo0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Boolean> f69599o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<String> f69600o0ooOOo;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<String> f69601o0ooOoO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Boolean> f69602oo000o;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Boolean> f69603oo0o0Oo;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Boolean> f69604ooOO;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public C27618OooO0oO f69605OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C24408OooO00o f69606OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public o00000OO f69607OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Boolean> f69543OooOoo0 = C24340OooO0oo.OooO00o("first_launch");

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<String> f69542OooOoo = C24340OooO0oo.OooO0o0("Authorization");

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<String> f69544OooOooO = C24340OooO0oo.OooO0o0(CommonConstant.KEY_UID);

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<String> f69545OooOooo = C24340OooO0oo.OooO0o0("guid");

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Integer> f69548Oooo000 = C24340OooO0oo.OooO0OO("pen_touch_button_double_pressed");

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Integer> f69549Oooo00O = C24340OooO0oo.OooO0OO("pen_first_btn_pressed");

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Integer> f69550Oooo00o = C24340OooO0oo.OooO0OO("pen_second_btn_pressed");

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Integer> f69547Oooo0 = C24340OooO0oo.OooO0OO("spen_btn_pressed");

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Integer> f69551Oooo0O0 = C24340OooO0oo.OooO0OO("lenovo_btn_pressed");

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Integer> f69552Oooo0OO = C24340OooO0oo.OooO0OO("vivo_btn_pressed");

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Integer> f69554Oooo0o0 = C24340OooO0oo.OooO0OO("oppo_pen_touch_button_double_pressed");

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Integer> f69553Oooo0o = C24340OooO0oo.OooO0OO("vivo_pen_touch_button_double_pressed");

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Integer> f69555Oooo0oO = C24340OooO0oo.OooO0OO("lenovo_pen_touch_button_double_pressed");

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Integer> f69556Oooo0oo = C24340OooO0oo.OooO0OO("display_mode");

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Boolean> f69546Oooo = C24340OooO0oo.OooO00o("pen_correct_to_line");

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Boolean> f69559OoooO00 = C24340OooO0oo.OooO00o("pen_press_to_eraser");

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Float> f69558OoooO0 = C24340OooO0oo.OooO0O0("pen_press_to_eraser_pressure");

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Boolean> f69560OoooO0O = C24340OooO0oo.OooO00o("erase_highlighter_only");

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Boolean> f69557OoooO = C24340OooO0oo.OooO00o("erase_tape_only");

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Boolean> f69561OoooOO0 = C24340OooO0oo.OooO00o("show_dual_link_icon");

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Boolean> f69586o000oOoO = C24340OooO0oo.OooO00o("show_hyper_link_icon");

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Boolean> f69562OoooOOO = C24340OooO0oo.OooO00o("fast_translate");

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Boolean> f69563OoooOOo = C24340OooO0oo.OooO00o("show_anchor_on_stroke_to_line");

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Boolean> f69564OoooOo0 = C24340OooO0oo.OooO00o("global_tool_box");

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Integer> f69565OoooOoO = C24340OooO0oo.OooO0OO("editor_swipe_direction");

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Boolean> f69566OoooOoo = C24340OooO0oo.OooO00o("reverse_editor_scroll_handle_position");

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Boolean> f69567Ooooo00 = C24340OooO0oo.OooO00o("pen_width_scale");

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Boolean> f69568Ooooo0o = C24340OooO0oo.OooO00o("page_double_tap");

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Integer> f69569OooooO0 = C24340OooO0oo.OooO0OO("page_double_tap_mode");

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Boolean> f69570OooooOO = C24340OooO0oo.OooO00o("non_stylus_pressure_eraser");

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Boolean> f69571OooooOo = C24340OooO0oo.OooO00o("layer_move_operation_visible");

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Boolean> f69573Oooooo0 = C24340OooO0oo.OooO00o("multi_finger_scroll");

    static {
        C24340OooO0oo.OooO00o("pdf_quote_enable");
        f69572Oooooo = C24340OooO0oo.OooO0OO("pdf_quote_mode");
        f69574OoooooO = C24340OooO0oo.OooO00o("key_assist_line_show_guides");
        f69575Ooooooo = C24340OooO0oo.OooO00o("key_assist_line_alignment");
        f69598o0OoOo0 = C24340OooO0oo.OooO00o("key_assist_line_angle_correction");
        f69604ooOO = C24340OooO0oo.OooO00o("page_fling");
        f69587o00O0O = C24340OooO0oo.OooO00o("page_free_move");
        f69588o00Oo0 = C24340OooO0oo.OooO0O0("page_fling_resistance");
        f69589o00Ooo = C24340OooO0oo.OooO00o("keep_screen_on");
        f69590o00o0O = C24340OooO0oo.OooO00o("display_undo_and_redo_button");
        f69593o00ooo = C24340OooO0oo.OooO00o("enable_undo_and_redo_gesture");
        f69602oo000o = C24340OooO0oo.OooO00o("enable_update_check");
        f69592o00oO0o = C24340OooO0oo.OooO00o("enable_color_inversion");
        f69591o00oO0O = C24340OooO0oo.OooO00o("enable_sticky_pen_box");
        f69599o0ooOO0 = C24340OooO0oo.OooO00o("enable_stylus_finger_quick_switch");
        f69600o0ooOOo = C24340OooO0oo.OooO0o0("hw_union_id");
        f69601o0ooOoO = C24340OooO0oo.OooO0o0("hw_access_token");
        C24340OooO0oo.OooO00o("user_has_confirmed_using_data_sync");
        C24340OooO0oo.OooO00o("cloud_auth_xiaomi");
        C24340OooO0oo.OooO00o("user_has_confirmed_using_data_sync_one_drive");
        f69596o0OOO0o = C24340OooO0oo.OooO0o0("custom_operate");
        f69597o0Oo0oo = C24340OooO0oo.OooO00o("is_first_time_install");
        f69595o0OO00O = C24340OooO0oo.OooO00o("is_hand_write_mode");
        f69603oo0o0Oo = C24340OooO0oo.OooO00o("is_pull_to_add_page");
        f69594o0O0O00 = C24340OooO0oo.OooO00o("show_historic_notes_when_locked");
        f69585o000OOo = C24340OooO0oo.OooO00o("is_show_tab_box");
        f69577o000000 = C24340OooO0oo.OooO00o("has_cleared_pdf_files");
        f69578o000000O = C24340OooO0oo.OooO00o("enable_fill_shape");
        f69579o000000o = C24340OooO0oo.OooO0O0("opacity_of_color_to_fill_shape");
        f69576o00000 = C24340OooO0oo.OooO0o0("date_format");
        f69581o00000O0 = C24340OooO0oo.OooO00o("enable_pen_box");
        f69580o00000O = C24340OooO0oo.OooO00o("reading_mode");
        f69582o00000OO = C24340OooO0oo.OooO00o("immersive_tool_bar");
        f69583o00000Oo = C24340OooO0oo.OooO00o("enable_fullscreen_mode");
        f69584o00000o0 = C24340OooO0oo.OooO00o("show_image_dimension_tips_dialog");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
    
        if (r7.OooO0O0(com.google.mlkit.p567nl.translate.TranslateLanguage.SPANISH, com.google.mlkit.p567nl.translate.TranslateLanguage.ENGLISH, r0) != r8) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0O0(App app, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26254OooO0OO c26254OooO0OO;
        C28081OooOO0 c28081OooOO0;
        if (abstractC32479OooO0OO instanceof C26254OooO0OO) {
            c26254OooO0OO = (C26254OooO0OO) abstractC32479OooO0OO;
            int i = c26254OooO0OO.f89710OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26254OooO0OO.f89710OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c26254OooO0OO = new C26254OooO0OO(app, abstractC32479OooO0OO);
            }
        }
        Object obj = c26254OooO0OO.f89709OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26254OooO0OO.f89710OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C28081OooOO0 c28081OooOO02 = C28081OooOO0.f99532OooO00o;
            c26254OooO0OO.f89710OooOoO0 = 1;
            if (c28081OooOO02.OooO0O0(TranslateLanguage.CHINESE, TranslateLanguage.ENGLISH, c26254OooO0OO) != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            C32446OooOOOo.OooO0O0(obj);
        } else {
            if (i2 == 2) {
                C32446OooOOOo.OooO0O0(obj);
                c28081OooOO0 = C28081OooOO0.f99532OooO00o;
                c26254OooO0OO.f89710OooOoO0 = 3;
                if (c28081OooOO0.OooO0O0(TranslateLanguage.PORTUGUESE, TranslateLanguage.ENGLISH, c26254OooO0OO) != enumC32485OooO00o) {
                    C28081OooOO0 c28081OooOO03 = C28081OooOO0.f99532OooO00o;
                    c26254OooO0OO.f89710OooOoO0 = 4;
                }
                return enumC32485OooO00o;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            C28081OooOO0 c28081OooOO032 = C28081OooOO0.f99532OooO00o;
            c26254OooO0OO.f89710OooOoO0 = 4;
        }
        C28081OooOO0 c28081OooOO04 = C28081OooOO0.f99532OooO00o;
        c26254OooO0OO.f89710OooOoO0 = 2;
        if (c28081OooOO04.OooO0O0(TranslateLanguage.FRENCH, TranslateLanguage.ENGLISH, c26254OooO0OO) != enumC32485OooO00o) {
            c28081OooOO0 = C28081OooOO0.f99532OooO00o;
            c26254OooO0OO.f89710OooOoO0 = 3;
            if (c28081OooOO0.OooO0O0(TranslateLanguage.PORTUGUESE, TranslateLanguage.ENGLISH, c26254OooO0OO) != enumC32485OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007d, code lost:
    
        if (oO0o0OO.C33609OooO0oo.OooO0o(r5, r6, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0OO(App app, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26255OooO0Oo c26255OooO0Oo;
        if (abstractC32479OooO0OO instanceof C26255OooO0Oo) {
            c26255OooO0Oo = (C26255OooO0Oo) abstractC32479OooO0OO;
            int i = c26255OooO0Oo.f89713OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26255OooO0Oo.f89713OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c26255OooO0Oo = new C26255OooO0Oo(app, abstractC32479OooO0OO);
            }
        }
        Object objOooOOo = c26255OooO0Oo.f89712OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26255OooO0Oo.f89713OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOo);
            Context applicationContext = app.getApplicationContext();
            OooOOO0.OooO0o(applicationContext, "getApplicationContext(...)");
            InterfaceC33721OooO0o<AbstractC24338OooO0o0> data = C28051OooO00o.OooO00o(applicationContext).getData();
            c26255OooO0Oo.f89713OooOoO0 = 1;
            objOooOOo = C25252OooO0Oo.OooOOo(data, c26255OooO0Oo);
            if (objOooOOo != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooOOo);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(objOooOOo);
        Integer num = (Integer) ((AbstractC24338OooO0o0) objOooOOo).OooO0OO(f69556Oooo0oo);
        int iIntValue = num != null ? num.intValue() : -1;
        int i3 = iIntValue != 1 ? iIntValue != 2 ? -1 : 2 : 1;
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        AbstractC33687OooO0oO abstractC33687OooO0oO = C33833OooOOOO.f121946OooO00o;
        C26257OooO0o0 c26257OooO0o0 = new C26257OooO0o0(i3, null);
        c26255OooO0Oo.f89713OooOoO0 = 2;
    }

    @Override // androidx.work.OooO00o.OooO0O0
    public final androidx.work.OooO00o OooO00o() {
        OooO00o.C19047OooO00o c19047OooO00o = new OooO00o.C19047OooO00o();
        C24408OooO00o c24408OooO00o = this.f69606OooOoO0;
        if (c24408OooO00o != null) {
            c19047OooO00o.f66683OooO00o = c24408OooO00o;
            return new androidx.work.OooO00o(c19047OooO00o);
        }
        OooOOO0.OooOOOO("workerFactory");
        throw null;
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context base) {
        OooOOO0.OooO0oO(base, "base");
        Configuration configuration = new Configuration(base.getResources().getConfiguration());
        configuration.uiMode = 0;
        super.attachBaseContext(base.createConfigurationContext(configuration));
    }

    /* JADX WARN: Finally extract failed */
    @Override // o0O0oooO.AbstractApplicationC26277OooOoOO, android.app.Application
    public final void onCreate() {
        boolean z;
        super.onCreate();
        C26275OooOoO c26275OooOoO = new C26275OooOoO(new File(getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS), "logs"));
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.getClass();
        if (c26275OooOoO == c20358OooO00o) {
            throw new IllegalArgumentException("Cannot plant Timber into itself.");
        }
        ArrayList<C34406OooO00o.OooO0O0> arrayList = C34406OooO00o.f123391OooO0O0;
        synchronized (arrayList) {
            arrayList.add(c26275OooOoO);
            Object[] array = arrayList.toArray(new C34406OooO00o.OooO0O0[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            C34406OooO00o.f123392OooO0OO = (C34406OooO00o.OooO0O0[]) array;
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        }
        c20358OooO00o.OooOOO0("App");
        String str = Build.BRAND;
        String str2 = Build.PRODUCT;
        String str3 = Build.MODEL;
        int i = Build.VERSION.SDK_INT;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("App onCreate start, flavor: google_play, versionName: v1.3.210.0, versionCode: 394, brand: ", str, ", product: ", str2, "， model: ");
        sbOooO0O0.append(str3);
        sbOooO0O0.append(", sdkVersion: ");
        sbOooO0O0.append(i);
        c20358OooO00o.OooO0o0(sbOooO0O0.toString(), new Object[0]);
        Firebase firebase = Firebase.INSTANCE;
        FirebaseKt.initialize(firebase, this);
        PlayIntegrityAppCheckProviderFactory playIntegrityAppCheckProviderFactory = PlayIntegrityAppCheckProviderFactory.getInstance();
        OooOOO0.OooO0Oo(playIntegrityAppCheckProviderFactory);
        FirebaseAppCheckKt.getAppCheck(firebase).installAppCheckProviderFactory(playIntegrityAppCheckProviderFactory);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(ExecutorC33873OooO0O0.f122045OooOoO0), null, null, new C26253OooO0O0(this, null), 3);
        C25732OooO0O0.OooO00o();
        if (!C25643OooO0O0.f87519OooO0O0) {
            C25643OooO0O0.f87519OooO0O0 = true;
        } else if (C25438OooO00o.f86720OooO00o.OooO00o(5)) {
            C25439OooO0O0.OooO0O0(5, C25643OooO0O0.class.getSimpleName(), "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!");
        }
        synchronized (C25787OooO00o.class) {
            z = C25787OooO00o.f87961OooO00o != null;
        }
        if (!z) {
            C25732OooO0O0.OooO00o();
            try {
                try {
                    try {
                        Class.forName("com.facebook.imagepipeline.nativecode.NativeCodeInitializer").getMethod(C18374u4.f56270c, Context.class).invoke(null, this);
                    } catch (IllegalAccessException unused) {
                        C25787OooO00o.OooO00o(new OooO0O0());
                    } catch (NoSuchMethodException unused2) {
                        C25787OooO00o.OooO00o(new OooO0O0());
                    }
                } catch (ClassNotFoundException unused3) {
                    C25787OooO00o.OooO00o(new OooO0O0());
                } catch (InvocationTargetException unused4) {
                    C25787OooO00o.OooO00o(new OooO0O0());
                }
                C25732OooO0O0.OooO00o();
            } catch (Throwable th) {
                C25732OooO0O0.OooO00o();
                throw th;
            }
        }
        Context context = getApplicationContext();
        synchronized (C25703OooOo0.class) {
            C25732OooO0O0.OooO00o();
            OooOOO0.OooO0oO(context, "context");
            C25703OooOo0.OooO0oo(new C25700OooOOo(new C25700OooOOo.OooO00o(context)));
            C25732OooO0O0.OooO00o();
        }
        C25732OooO0O0.OooO00o();
        C25646OooO0o0 c25646OooO0o0 = new C25646OooO0o0(context);
        C25643OooO0O0.f87518OooO00o = c25646OooO0o0;
        SimpleDraweeView.f67245OooOooo = c25646OooO0o0;
        C25732OooO0O0.OooO00o();
        C25732OooO0O0.OooO00o();
        FontManager.preLoadFonts(this);
        new RTApi(getApplicationContext(), null);
        C31428OooO00o.f112202OooO00o = getApplicationContext().getApplicationContext().getAssets();
        DrawToolFactory.INSTANCE.init(this);
        BrushFamilyProvider.INSTANCE.init(this);
        C31277OooOO0O c31277OooOO0O = new C31277OooOO0O();
        synchronized (com.orion.ni_render_engine.impl.ink.OooO0O0.f69447OooO0O0) {
            try {
                ArrayList arrayList2 = com.orion.ni_render_engine.impl.ink.OooO0O0.f69446OooO00o;
                if (arrayList2 == null || !arrayList2.isEmpty()) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        if (((OooO0O0.OooO00o) it.next()).f69448OooO00o.equals(c31277OooOO0O)) {
                            break;
                        }
                    }
                }
                ArrayList arrayList3 = com.orion.ni_render_engine.impl.ink.OooO0O0.f69446OooO00o;
                arrayList3.add(new OooO0O0.OooO00o(c31277OooOO0O));
                if (arrayList3.size() > 1) {
                    C34431OooOo0.OooOooO(arrayList3, new OooO0OO());
                }
                C34406OooO00o.f123390OooO00o.OooO00o("注册渲染器: " + C24035Oooo00o.f80943OooO00o.OooO0O0(C31277OooOO0O.class).OooOO0() + ", 优先级: 0", new Object[0]);
                C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C22841OooO0o0.OooO00o(new C31279OooO0O0());
        C22841OooO0o0.OooO00o(new C31270OooO0OO());
        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o2.OooOOO0("App");
        c20358OooO00o2.OooO0o0("onCreate end", new Object[0]);
        C27618OooO0oO c27618OooO0oO = this.f69605OooOoO;
        if (c27618OooO0oO == null) {
            OooOOO0.OooOOOO("cloudHandler");
            throw null;
        }
        C33664o00000Oo c33664o00000OoOooO00o = OooOO0.OooO00o();
        C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
        this.f69607OooOoOO = C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(InterfaceC34415OooO0oo.OooO0O0.OooO00o.OooO0Oo(c33664o00000OoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0)), null, null, new C27620OooOO0(c27618OooO0oO, null), 3);
    }

    @Override // android.app.Application
    public final void onTerminate() {
        super.onTerminate();
        o00000OO o00000oo2 = this.f69607OooOoOO;
        if (o00000oo2 != null) {
            o00000oo2.cancel((CancellationException) null);
        } else {
            OooOOO0.OooOOOO("cloudSyncJob");
            throw null;
        }
    }
}
