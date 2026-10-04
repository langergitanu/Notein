package com.orion.notein.p607ui.noteeditor.toolbox;

import OooOoO.C20509OooO0oo;
import Oooo0.o000000O;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.internal.p332p7.C22236OooO0Oo;
import com.aspose.words.StyleIdentifier;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import com.orion.notein.p607ui.p609vo.PenColorVO;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import o0O0o0oO.o0O0O00;
import o0O0o0oO.o0OO00O;
import o0O0o0oO.o0OOO0o;
import o0O0o0oO.o0Oo0oo;
import o0O0o0oO.oo0o0Oo;
import o0O0o0oo.ViewOnClickListenerC26076OooO0o;
import o0Oo00oO.C28036OooO0O0;
import o0Oo00oO.C28038OooO0Oo;
import o0Oo0o0o.oo000o;
import o0Oo0oO0.ViewOnClickListenerC28288OooO;
import o0Oo0oO0.ViewOnClickListenerC28296OooO0oo;
import o0OoO000.ViewOnClickListenerC28526OooO0o0;
import o0OoO000.ViewOnClickListenerC28534OooOOoo;
import o0OoO0oo.C28971o0OO00O;
import o0OoO0oo.RunnableC28780o0000oo;
import o0o00Oo.C29894OooO00o;
import o0o00Oo.C29895OooO0O0;
import o0o00Oo.C29901OooO0oo;
import o0o00Oo.C29904OooOOo;
import o0o00Oo.C29905OooOOo0;
import o0o00Oo.C29906OooOOoo;
import o0o00Oo.InterfaceC29896OooO0OO;
import o0o00Oo.InterfaceC29898OooO0o;
import o0o00Oo.OooOo00;
import o0o00Ooo.OooOO0;
import o0o00o0O.C29947OooO0OO;
import o0o00o0O.C29948OooO0Oo;
import o0o00o0O.C29949OooO0o;
import o0o00o0O.C29950OooO0o0;
import o0o00o0O.C29951OooO0oO;
import o0o00o0O.C29952OooO0oo;
import o0o00o0O.C29953OooOO0o;
import o0o00oO0.C29999OooOo0o;
import oO00ooO.C32443OooOOO;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34444Oooo0O0;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001:\u001eÉ\u0001Ê\u0001Ë\u0001Ì\u0001Í\u0001Î\u0001Ï\u0001Ð\u0001Ñ\u0001Ò\u0001Ó\u0001Ô\u0001Õ\u0001Ö\u0001×\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\nJ\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\nJ\u0015\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\nJ\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u000fJ\u000f\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u000fJ\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u000fR\"\u0010\u001f\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\nR\"\u0010#\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\nR$\u0010+\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R.\u00100\u001a\u0004\u0018\u00010$2\b\u0010,\u001a\u0004\u0018\u00010$8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010&\u001a\u0004\b.\u0010(\"\u0004\b/\u0010*R$\u00104\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010&\u001a\u0004\b2\u0010(\"\u0004\b3\u0010*R$\u00108\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010&\u001a\u0004\b6\u0010(\"\u0004\b7\u0010*R$\u0010<\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010&\u001a\u0004\b:\u0010(\"\u0004\b;\u0010*R$\u0010@\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010&\u001a\u0004\b>\u0010(\"\u0004\b?\u0010*R.\u0010H\u001a\u0004\u0018\u00010A2\b\u0010,\u001a\u0004\u0018\u00010A8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR.\u0010P\u001a\u0004\u0018\u00010I2\b\u0010,\u001a\u0004\u0018\u00010I8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR.\u0010X\u001a\u0004\u0018\u00010Q2\b\u0010,\u001a\u0004\u0018\u00010Q8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR.\u0010`\u001a\u0004\u0018\u00010Y2\b\u0010,\u001a\u0004\u0018\u00010Y8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R.\u0010h\u001a\u0004\u0018\u00010a2\b\u0010,\u001a\u0004\u0018\u00010a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR.\u0010p\u001a\u0004\u0018\u00010i2\b\u0010,\u001a\u0004\u0018\u00010i8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR.\u0010x\u001a\u0004\u0018\u00010q2\b\u0010,\u001a\u0004\u0018\u00010q8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR/\u0010\u0080\u0001\u001a\u0004\u0018\u00010y2\b\u0010,\u001a\u0004\u0018\u00010y8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR7\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0081\u00012\t\u0010,\u001a\u0005\u0018\u00010\u0081\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R7\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u0089\u00012\t\u0010,\u001a\u0005\u0018\u00010\u0089\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R(\u0010\u0094\u0001\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0091\u0001\u0010&\u001a\u0005\b\u0092\u0001\u0010(\"\u0005\b\u0093\u0001\u0010*R7\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u0095\u00012\t\u0010,\u001a\u0005\u0018\u00010\u0095\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001R7\u0010¤\u0001\u001a\u0005\u0018\u00010\u009d\u00012\t\u0010,\u001a\u0005\u0018\u00010\u009d\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001\"\u0006\b¢\u0001\u0010£\u0001R7\u0010¬\u0001\u001a\u0005\u0018\u00010¥\u00012\t\u0010,\u001a\u0005\u0018\u00010¥\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b¦\u0001\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001\"\u0006\bª\u0001\u0010«\u0001R/\u0010\r\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\u0017\n\u0006\b\u00ad\u0001\u0010®\u0001\u0012\u0006\b°\u0001\u0010±\u0001\u001a\u0005\b¯\u0001\u0010\u0017R6\u0010\u0014\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u001e\n\u0006\b²\u0001\u0010®\u0001\u0012\u0006\bµ\u0001\u0010±\u0001\u001a\u0005\b³\u0001\u0010\u0017\"\u0005\b´\u0001\u0010\u000fR,\u0010·\u0001\u001a\u0005\u0018\u00010¶\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b·\u0001\u0010¸\u0001\u001a\u0006\b¹\u0001\u0010º\u0001\"\u0006\b»\u0001\u0010¼\u0001R,\u0010¾\u0001\u001a\u0005\u0018\u00010½\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¾\u0001\u0010¿\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001\"\u0006\bÂ\u0001\u0010Ã\u0001R\u001d\u0010Å\u0001\u001a\u00030Ä\u00018\u0006¢\u0006\u0010\n\u0006\bÅ\u0001\u0010Æ\u0001\u001a\u0006\bÇ\u0001\u0010È\u0001¨\u0006Ø\u0001"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/toolbox/PenBox;", "Landroid/widget/FrameLayout;", "", "color", "LoO00ooO/OooOooO;", "setLassoActivatedTextColor", "(Ljava/lang/Integer;)V", "", "isVisible", "setVipBadgeVisible", "(Z)V", NoteMeta.PROPERTY_FAVORITE, "setColorSetFavorite", "state", "setStateWithAnim", "(I)V", "visible", "setToolBoxVisible", "enabled", "setCorrectToLine", RequestParameters.POSITION, "setPositionWithAnimWrapper", "getNormalWidth", "()I", "setPositionWithOutAnim", "setPositionWithAnim", "OooOoo0", "Z", "getDualLinkFeature", "()Z", "setDualLinkFeature", "dualLinkFeature", "OooOoo", "getImmersiveMode", "setImmersiveMode", "immersiveMode", "Landroid/view/View$OnClickListener;", "OooOooO", "Landroid/view/View$OnClickListener;", "getColorSetFavoriteOnClick", "()Landroid/view/View$OnClickListener;", "setColorSetFavoriteOnClick", "(Landroid/view/View$OnClickListener;)V", "colorSetFavoriteOnClick", "value", "OooOooo", "getColorSetOnClickListener", "setColorSetOnClickListener", "colorSetOnClickListener", "Oooo000", "getOnInsertTextBoxClickListener", "setOnInsertTextBoxClickListener", "onInsertTextBoxClickListener", "Oooo00O", "getPenItemClickListener", "setPenItemClickListener", "penItemClickListener", "Oooo00o", "getPenColorItemClickListener", "setPenColorItemClickListener", "penColorItemClickListener", "Oooo0", "getPenWidthItemClickListener", "setPenWidthItemClickListener", "penWidthItemClickListener", "Lo0o00Ooo/OooOO0$OooO00o;", "Oooo0O0", "Lo0o00Ooo/OooOO0$OooO00o;", "getColorPickerEventListener", "()Lo0o00Ooo/OooOO0$OooO00o;", "setColorPickerEventListener", "(Lo0o00Ooo/OooOO0$OooO00o;)V", "colorPickerEventListener", "Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooO0oO;", "Oooo0OO", "Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooO0oO;", "getPenWidthSeekBarListener", "()Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooO0oO;", "setPenWidthSeekBarListener", "(Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooO0oO;)V", "penWidthSeekBarListener", "Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooO0o;", "Oooo0o0", "Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooO0o;", "getPenColorPickerListener", "()Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooO0o;", "setPenColorPickerListener", "(Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooO0o;)V", "penColorPickerListener", "Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooO;", "Oooo0o", "Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooO;", "getTapePenSettingChangedListener", "()Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooO;", "setTapePenSettingChangedListener", "(Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooO;)V", "tapePenSettingChangedListener", "Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooO0OO;", "Oooo0oO", "Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooO0OO;", "getInkPenSettingChangedListener", "()Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooO0OO;", "setInkPenSettingChangedListener", "(Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooO0OO;)V", "inkPenSettingChangedListener", "Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooO00o;", "Oooo0oo", "Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooO00o;", "getEraserTypeListener", "()Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooO00o;", "setEraserTypeListener", "(Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooO00o;)V", "eraserTypeListener", "Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooO0Oo;", "Oooo", "Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooO0Oo;", "getLaserPenChangedListener", "()Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooO0Oo;", "setLaserPenChangedListener", "(Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooO0Oo;)V", "laserPenChangedListener", "Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooOO0o;", "OoooO00", "Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooOO0o;", "getVectorPenChangedListener", "()Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooOO0o;", "setVectorPenChangedListener", "(Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooOO0o;)V", "vectorPenChangedListener", "Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooO0O0;", "OoooO0", "Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooO0O0;", "getHlSettingsListener", "()Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooO0O0;", "setHlSettingsListener", "(Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooO0O0;)V", "hlSettingsListener", "Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooO0o0;", "OoooO0O", "Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooO0o0;", "getLassoFilterListener", "()Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooO0o0;", "setLassoFilterListener", "(Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooO0o0;)V", "lassoFilterListener", "OoooO", "getPenActionButtonClickListener", "setPenActionButtonClickListener", "penActionButtonClickListener", "Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooOOO;", "OoooOO0", "Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooOOO;", "getPenSettingsFavoritesListener", "()Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooOOO;", "setPenSettingsFavoritesListener", "(Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooOOO;)V", "penSettingsFavoritesListener", "Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooOOO0;", "o000oOoO", "Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooOOO0;", "getPenSettingsCorrectToLineListener", "()Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooOOO0;", "setPenSettingsCorrectToLineListener", "(Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooOOO0;)V", "penSettingsCorrectToLineListener", "Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooOOOO;", "OoooOOO", "Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooOOOO;", "getPenSettingsFillShapeWithColorListener", "()Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooOOOO;", "setPenSettingsFillShapeWithColorListener", "(Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooOOOO;)V", "penSettingsFillShapeWithColorListener", "oo0o0Oo", "I", "getState", "getState$annotations", "()V", "o0O0O00", "getPosition", "setPosition", "getPosition$annotations", "Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooOO0;", "onPositionChangedListener", "Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooOO0;", "getOnPositionChangedListener", "()Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooOO0;", "setOnPositionChangedListener", "(Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooOO0;)V", "Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooOO0O;", "onStateChangedListener", "Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooOO0O;", "getOnStateChangedListener", "()Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooOO0O;", "setOnStateChangedListener", "(Lcom/orion/notein/ui/noteeditor/toolbox/PenBox$OooOO0O;)V", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "layoutListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "getLayoutListener", "()Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "OooOO0", "OooO0o0", "OooOO0O", "OooO0O0", "OooO00o", "OooO0Oo", "OooOO0o", "OooO0OO", "OooO", "OooO0oo", "OooO0oO", "OooO0o", "OooOOO", "OooOOO0", "OooOOOO", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class PenBox extends FrameLayout {

    /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
    public static final /* synthetic */ int f76736o000OOo = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public float f76737OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public float f76738OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public float f76739OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public float f76740OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f76741OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name and from kotlin metadata */
    public boolean immersiveMode;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name and from kotlin metadata */
    public boolean dualLinkFeature;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name and from kotlin metadata */
    public View.OnClickListener colorSetFavoriteOnClick;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name and from kotlin metadata */
    public View.OnClickListener colorSetOnClickListener;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name and from kotlin metadata */
    public InterfaceC23605OooO0Oo laserPenChangedListener;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name and from kotlin metadata */
    public View.OnClickListener penWidthItemClickListener;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name and from kotlin metadata */
    public View.OnClickListener onInsertTextBoxClickListener;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name and from kotlin metadata */
    public View.OnClickListener penItemClickListener;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name and from kotlin metadata */
    public View.OnClickListener penColorItemClickListener;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name and from kotlin metadata */
    public OooOO0.OooO00o colorPickerEventListener;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name and from kotlin metadata */
    public InterfaceC23607OooO0oO penWidthSeekBarListener;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name and from kotlin metadata */
    public OooO tapePenSettingChangedListener;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name and from kotlin metadata */
    public OooO0o penColorPickerListener;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name and from kotlin metadata */
    public OooO0OO inkPenSettingChangedListener;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name and from kotlin metadata */
    public OooO00o eraserTypeListener;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name and from kotlin metadata */
    public View.OnClickListener penActionButtonClickListener;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name and from kotlin metadata */
    public OooO0O0 hlSettingsListener;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name and from kotlin metadata */
    public InterfaceC23609OooOO0o vectorPenChangedListener;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name and from kotlin metadata */
    public InterfaceC23606OooO0o0 lassoFilterListener;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name and from kotlin metadata */
    public OooOOO penSettingsFavoritesListener;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name and from kotlin metadata */
    public OooOOOO penSettingsFillShapeWithColorListener;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public RecyclerView f76763OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public C29901OooO0oo f76764OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public C29950OooO0o0 f76765OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public o0o00o0O.OooOO0O f76766OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public C29948OooO0Oo f76767Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public C29947OooO0OO f76768Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public C29951OooO0oO f76769OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public C29949OooO0o f76770OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public C29953OooOO0o f76771OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public C29904OooOOo f76772Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public RecyclerView f76773Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public o0o00Ooo.OooOO0 f76774OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public o0o00Ooo.OooOO0 f76775Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name and from kotlin metadata */
    public OooOOO0 penSettingsCorrectToLineListener;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public C29952OooO0oo f76777o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public C29894OooO00o f76778o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public com.orion.notein.p607ui.noteeditor.toolbox.OooO00o f76779o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public View f76780o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public View f76781o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public ImageView f76782o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public ImageView f76783o00ooo;

    /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name and from kotlin metadata */
    public int position;

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    public AnimatorSet f76785o0OO00O;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public View f76786o0OOO0o;

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    public long f76787o0Oo0oo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public ImageView f76788o0OoOo0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public View f76789o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public View f76790o0ooOOo;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public View f76791o0ooOoO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public ImageView f76792oo000o;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name and from kotlin metadata */
    public int state;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public C29906OooOOoo f76794ooOO;

    public interface OooO {
        void OooO00o(float f, int i, int i2);

        void OooO0O0(boolean z);

        void OooO0OO(boolean z);
    }

    public interface OooO00o {
        void OooO00o(float f, int i, int i2);

        void OooO0O0(String str);

        void OooO0OO(boolean z);

        void OooO0Oo(boolean z);

        void OooO0o(float f);

        void OooO0o0(boolean z);
    }

    public interface OooO0O0 {
        void OooO00o(float f, int i, int i2);

        void OooO0O0(int i);

        void OooO0OO(int i, String str, String str2);
    }

    public interface OooO0OO {
        void OooO00o(float f, int i, int i2);

        void OooO0O0(int i);

        void OooO0OO(String str, float f);

        void OooO0Oo(C29999OooOo0o c29999OooOo0o);
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbox.PenBox$OooO0Oo, reason: case insensitive filesystem */
    public interface InterfaceC23605OooO0Oo {
        void OooO00o(float f, int i, int i2);

        void OooO0O0(String str);

        void OooO0OO(int i);
    }

    public interface OooO0o {
        void OooO00o(int i, int i2, int i3);
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbox.PenBox$OooO0o0, reason: case insensitive filesystem */
    public interface InterfaceC23606OooO0o0 {
        void OooO00o(Bundle bundle);

        void OooO0O0();

        void OooO0OO(List<String> list);

        void OooO0Oo(boolean z);
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbox.PenBox$OooO0oO, reason: case insensitive filesystem */
    public interface InterfaceC23607OooO0oO {
        void OooO00o(float f, int i, int i2);
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbox.PenBox$OooO0oo, reason: case insensitive filesystem */
    public interface InterfaceC23608OooO0oo {
        void OooO00o(float f, int i, int i2);

        void OooO0O0(int i);
    }

    public interface OooOO0 {
    }

    public interface OooOO0O {
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbox.PenBox$OooOO0o, reason: case insensitive filesystem */
    public interface InterfaceC23609OooOO0o {
        void OooO00o(float f, int i, int i2);

        void OooO0O0(String str);
    }

    public interface OooOOO {
        void OooO00o(int i);

        void OooO0O0(int i);

        boolean OooO0OO();

        boolean OooO0Oo(int i, Bundle bundle);
    }

    public interface OooOOO0 {
        void OooO00o();

        void OooO0O0(boolean z);
    }

    public interface OooOOOO {
        void OooO00o(boolean z);

        default boolean OooO0O0() {
            return true;
        }

        void OooO0OO(int i);
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbox.PenBox$OooOOOo, reason: case insensitive filesystem */
    public static final class C23610OooOOOo implements OooOO0.OooO00o {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ OooOO0.OooO00o f76796OooO0O0;

        public C23610OooOOOo(OooOO0.OooO00o oooO00o) {
            this.f76796OooO0O0 = oooO00o;
        }

        @Override // o0o00Ooo.OooOO0.OooO00o
        public final void OooO00o() {
            PenBox penBox = PenBox.this;
            C29950OooO0o0 c29950OooO0o0 = penBox.f76765OoooOoO;
            if (c29950OooO0o0 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("inkPenSettingPopupWindow");
                throw null;
            }
            o0o00o0O.OooOO0O oooOO0O = penBox.f76766OoooOoo;
            if (oooOO0O == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("tapePenSettingPopupWindow");
                throw null;
            }
            C29948OooO0Oo c29948OooO0Oo = penBox.f76767Ooooo00;
            if (c29948OooO0Oo == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("hlSettingsPopupWindow");
                throw null;
            }
            C29947OooO0OO c29947OooO0OO = penBox.f76768Ooooo0o;
            if (c29947OooO0OO == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("eraserSettingsPopupWindow");
                throw null;
            }
            C29951OooO0oO c29951OooO0oO = penBox.f76769OooooO0;
            if (c29951OooO0oO == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("lassoSettingsPopupWindow");
                throw null;
            }
            C29949OooO0o c29949OooO0o = penBox.f76770OooooOO;
            if (c29949OooO0o == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("laserSettingsPopupWindow");
                throw null;
            }
            C29953OooOO0o c29953OooOO0o = penBox.f76771OooooOo;
            if (c29953OooOO0o == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("vectorPenSettingsPopupWindow");
                throw null;
            }
            o0o00Ooo.OooOO0 oooOO02 = penBox.f76774OoooooO;
            if (oooOO02 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("penColorPopupWindow");
                throw null;
            }
            o0o00Ooo.OooOO0 oooOO03 = penBox.f76775Ooooooo;
            if (oooOO03 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("penColorPopupWindowInSidePen");
                throw null;
            }
            C29952OooO0oo c29952OooO0oo = penBox.f76777o00O0O;
            if (c29952OooO0oo == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("penWidthPopupWindow");
                throw null;
            }
            com.orion.notein.p607ui.noteeditor.toolbox.OooO00o oooO00o = penBox.f76779o00Ooo;
            if (oooO00o == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("eraserWidthPopupWindow");
                throw null;
            }
            Iterator it = C34429OooOOo0.OooOO0o(c29950OooO0o0, oooOO0O, c29948OooO0Oo, c29947OooO0OO, c29951OooO0oO, c29949OooO0o, c29953OooOO0o, oooOO02, oooOO03, c29952OooO0oo, oooO00o).iterator();
            while (it.hasNext()) {
                ((InterfaceC29896OooO0OO) it.next()).dismiss();
            }
            OooOO0.OooO00o oooO00o2 = this.f76796OooO0O0;
            if (oooO00o2 != null) {
                oooO00o2.OooO00o();
            }
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbox.PenBox$OooOOo, reason: case insensitive filesystem */
    public static final class C23611OooOOo implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ int f76798OooO0O0;

        public C23611OooOOo(int i) {
            this.f76798OooO0O0 = i;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            int i = PenBox.f76736o000OOo;
            PenBox.this.OooO0oo(this.f76798OooO0O0);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbox.PenBox$OooOOo0, reason: case insensitive filesystem */
    public static final class C23612OooOOo0 implements InterfaceC29898OooO0o {
        public C23612OooOOo0() {
        }

        @Override // o0o00Oo.InterfaceC29898OooO0o
        public final void OooO00o(PenColorVO penColorVO, View clickedView, View anchorView) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(clickedView, "clickedView");
            kotlin.jvm.internal.OooOOO0.OooO0oO(anchorView, "anchorView");
            boolean selected = penColorVO.getSelected();
            PenBox penBox = PenBox.this;
            if (selected) {
                penBox.f76775Ooooooo.OooO0oO(anchorView, penColorVO);
                return;
            }
            View.OnClickListener penColorItemClickListener = penBox.getPenColorItemClickListener();
            if (penColorItemClickListener != null) {
                penColorItemClickListener.onClick(clickedView);
            }
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbox.PenBox$OooOOoo, reason: case insensitive filesystem */
    public static final class C23613OooOOoo implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ int f76801OooO0O0;

        public C23613OooOOoo(int i) {
            this.f76801OooO0O0 = i;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            PenBox.this.setPositionWithAnim(this.f76801OooO0O0);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    public static void OooO00o(PenBox penBox) {
        int iOooO0o = penBox.OooO0o(penBox.state);
        penBox.setPosition(iOooO0o);
        penBox.setPositionWithAnimWrapper(iOooO0o);
    }

    public static void OooO0O0(PenBox penBox, MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        Log.d("ToolBox", motionEvent.getAction() + ": (" + motionEvent.getRawX() + "," + motionEvent.getRawY() + "),(" + motionEvent.getX() + "," + motionEvent.getY() + ")");
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            penBox.f76787o0Oo0oo = System.currentTimeMillis();
            penBox.f76738OooOo0o = rawX;
            penBox.f76737OooOo = rawY;
            penBox.f76740OooOoO0 = rawX;
            penBox.f76739OooOoO = rawY;
            return;
        }
        if (action != 1) {
            if (action == 2) {
                float f = rawX - penBox.f76740OooOoO0;
                float f2 = rawY - penBox.f76739OooOoO;
                penBox.setX(penBox.getX() + f);
                penBox.setY(Math.max(0.0f, penBox.getY() + f2));
                penBox.f76740OooOoO0 = rawX;
                penBox.f76739OooOoO = rawY;
                if (penBox.OooO0o0(rawX, rawY)) {
                    penBox.setPosition(8);
                }
                ViewParent parent = penBox.getParent();
                kotlin.jvm.internal.OooOOO0.OooO0o0(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                int width = ((ViewGroup) parent).getWidth();
                ViewParent parent2 = penBox.getParent();
                kotlin.jvm.internal.OooOOO0.OooO0o0(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
                int height = ((ViewGroup) parent2).getHeight();
                float x = penBox.getX() + (penBox.getWidth() / 2);
                if (penBox.getY() + penBox.getHeight() <= height - o000000O.OooO0o(60) || x <= (penBox.getNormalWidth() - o000000O.OooO0o(60)) / 2 || x >= width - ((penBox.getNormalWidth() - o000000O.OooO0o(60)) / 2)) {
                    ViewParent parent3 = penBox.getParent();
                    kotlin.jvm.internal.OooOOO0.OooO0o0(parent3, "null cannot be cast to non-null type android.view.ViewGroup");
                    int width2 = ((ViewGroup) parent3).getWidth();
                    float x2 = penBox.getX() + (penBox.getWidth() / 2);
                    if (penBox.getY() >= o000000O.OooO0o(60) || x2 <= penBox.getNormalWidth() / 2 || x2 >= width2 - (penBox.getNormalWidth() / 2)) {
                        ViewParent parent4 = penBox.getParent();
                        kotlin.jvm.internal.OooOOO0.OooO0o0(parent4, "null cannot be cast to non-null type android.view.ViewGroup");
                        ViewGroup viewGroup = (ViewGroup) parent4;
                        int height2 = viewGroup.getHeight();
                        float x3 = penBox.getX();
                        float y = penBox.getY();
                        float rotation = penBox.getRotation();
                        int height3 = penBox.getHeight();
                        StringBuilder sbOooO0Oo = C20509OooO0oo.OooO0Oo("isInLeftArea x,y ", x3, ",", y, ", ");
                        sbOooO0Oo.append(rawX);
                        sbOooO0Oo.append(",");
                        sbOooO0Oo.append(rawY);
                        sbOooO0Oo.append(" r:");
                        sbOooO0Oo.append(rotation);
                        sbOooO0Oo.append(", h:");
                        sbOooO0Oo.append(height3);
                        Log.d("ToolBox", sbOooO0Oo.toString());
                        if (penBox.getRotation() != 90.0f ? !(rawX >= o000000O.OooO0o(60) || rawY <= viewGroup.getY() + (penBox.getNormalWidth() / 2) || rawY >= (viewGroup.getY() + height2) - (penBox.getNormalWidth() / 2)) : !(rawX >= penBox.getHeight() + o000000O.OooO0o(60) || rawY <= viewGroup.getY() + (penBox.getNormalWidth() / 2) || rawY >= (viewGroup.getY() + height2) - (penBox.getNormalWidth() / 2))) {
                            Log.d("ToolBox", "isInLeftArea() == true");
                            penBox.setPosition(16);
                            penBox.setStateWithAnim(0);
                            return;
                        }
                        ViewParent parent5 = penBox.getParent();
                        kotlin.jvm.internal.OooOOO0.OooO0o0(parent5, "null cannot be cast to non-null type android.view.ViewGroup");
                        int width3 = ((ViewGroup) parent5).getWidth();
                        ViewParent parent6 = penBox.getParent();
                        kotlin.jvm.internal.OooOOO0.OooO0o0(parent6, "null cannot be cast to non-null type android.view.ViewGroup");
                        int height4 = ((ViewGroup) parent6).getHeight();
                        float x4 = penBox.getX() + (penBox.getWidth() / 2);
                        float y2 = penBox.getY() + (penBox.getHeight() / 2);
                        Matrix matrix = new Matrix();
                        matrix.setRotate(penBox.getRotation(), x4, y2);
                        float[] fArr = {penBox.getX(), penBox.getY()};
                        matrix.mapPoints(fArr);
                        float x5 = penBox.getX();
                        float y3 = penBox.getY();
                        float f3 = fArr[0];
                        float f4 = fArr[1];
                        StringBuilder sbOooO0Oo2 = C20509OooO0oo.OooO0Oo("isInRightArea x,y ", x5, ",", y3, ", ");
                        sbOooO0Oo2.append(f3);
                        sbOooO0Oo2.append(",");
                        sbOooO0Oo2.append(f4);
                        Log.d("ToolBox", sbOooO0Oo2.toString());
                        if (fArr[0] <= (width3 - penBox.getHeight()) - o000000O.OooO0o(60) || y2 <= penBox.getNormalWidth() / 2 || y2 >= height4 - (penBox.getNormalWidth() / 2)) {
                            penBox.setStateWithAnim(1);
                            return;
                        }
                        Log.d("ToolBox", "isInRightArea() == true");
                        penBox.setPosition(17);
                        penBox.setStateWithAnim(0);
                        return;
                    }
                }
                penBox.setPosition(9);
                penBox.setStateWithAnim(0);
                return;
            }
            if (action != 3) {
                return;
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - penBox.f76787o0Oo0oo;
        if (jCurrentTimeMillis < 100 && !penBox.OooO0o0(rawX, rawY)) {
            Log.d("ToolBox", "clicked");
            penBox.requestFocus();
            penBox.setStateWithAnim(0);
        } else {
            if (jCurrentTimeMillis < 200) {
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC28780o0000oo(penBox, 1), ((long) 200) - jCurrentTimeMillis);
                return;
            }
            int iOooO0o = penBox.OooO0o(penBox.state);
            penBox.setPosition(iOooO0o);
            penBox.setPositionWithAnimWrapper(iOooO0o);
        }
    }

    private final int getNormalWidth() {
        return Math.min(getResources().getConfiguration().screenWidthDp, getResources().getConfiguration().screenHeightDp) >= 488 ? o000000O.OooO0o(500) : o000000O.OooO0o(StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_2);
    }

    public static /* synthetic */ void getPosition$annotations() {
    }

    public static /* synthetic */ void getState$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPositionWithAnim(int position) {
        C34406OooO00o.f123390OooO00o.OooO00o(C21532OooOOo.OooO0OO(position, "ToolBox1, setPositionWithAnim position: "), new Object[0]);
        C32443OooOOO<Integer, Integer> c32443OooOOOOooO0oO = OooO0oO(position);
        int iIntValue = c32443OooOOOOooO0oO.f116638OooOo0o.intValue();
        int iIntValue2 = c32443OooOOOOooO0oO.f116637OooOo.intValue();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt((int) getX(), iIntValue);
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt((int) getY(), iIntValue2);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o0o00Oo.OooOO0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i = PenBox.f76736o000OOo;
                this.f106087OooO00o.setX(((Integer) C28971o0OO00O.OooO00o(valueAnimator, TranslateLanguage.ITALIAN, "null cannot be cast to non-null type kotlin.Int")).intValue());
            }
        });
        valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o0o00Oo.OooOOO0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i = PenBox.f76736o000OOo;
                this.f106094OooO00o.setY(((Integer) C28971o0OO00O.OooO00o(valueAnimator, TranslateLanguage.ITALIAN, "null cannot be cast to non-null type kotlin.Int")).intValue());
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfInt, valueAnimatorOfInt2);
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.start();
        animatorSet.addListener(new C23611OooOOo(position));
    }

    private final void setPositionWithAnimWrapper(int position) {
        AnimatorSet animatorSet = this.f76785o0OO00O;
        if (animatorSet.isRunning()) {
            animatorSet.addListener(new C23613OooOOoo(position));
        } else {
            setPositionWithAnim(position);
        }
    }

    private final void setPositionWithOutAnim(int position) {
        switch (position) {
            case 0:
            case 6:
                final float fOooO0o0 = o000000O.OooO0o0(16.0f);
                OooO0Oo();
                postDelayed(new Runnable() { // from class: o0o00Oo.OooOOOO
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = PenBox.f76736o000OOo;
                        PenBox penBox = this.f106096OooOo0o;
                        penBox.setX(fOooO0o0);
                        penBox.requestLayout();
                    }
                }, 10L);
                break;
            case 1:
            case 5:
                setRotation(0.0f);
                break;
            case 2:
            case 4:
                ViewParent parent = getParent();
                kotlin.jvm.internal.OooOOO0.OooO0o0(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                final int width = ((ViewGroup) parent).getWidth();
                final float fOooO0o02 = o000000O.OooO0o0(16.0f);
                OooO0Oo();
                postDelayed(new Runnable() { // from class: o0o00Oo.OooOOOo
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = PenBox.f76736o000OOo;
                        float f = width - fOooO0o02;
                        PenBox penBox = this.f106098OooOo0o;
                        penBox.setX(f - penBox.getHeight());
                        penBox.requestLayout();
                    }
                }, 10L);
                break;
            case 3:
                setRotation(270.0f);
                setLayoutDirection(1);
                break;
            case 7:
                setRotation(90.0f);
                break;
        }
        C32443OooOOO<Integer, Integer> c32443OooOOOOooO0oO = OooO0oO(position);
        int iIntValue = c32443OooOOOOooO0oO.f116638OooOo0o.intValue();
        int iIntValue2 = c32443OooOOOOooO0oO.f116637OooOo.intValue();
        setX(iIntValue);
        setY(iIntValue2);
        C34406OooO00o.f123390OooO00o.OooO00o(C21532OooOOo.OooO0OO(position, "ToolBox1, setPositionWithoutAnim position: "), new Object[0]);
        OooO0oo(position);
        requestLayout();
    }

    public final void OooO0Oo() {
        this.state = 1;
        View view = this.f76789o0ooOO0;
        if (view == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("toolBoxIconWrapper");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.OooOOO0.OooO0o0(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.width = -2;
        marginLayoutParams.setMarginStart(0);
        View view2 = this.f76789o0ooOO0;
        if (view2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("toolBoxIconWrapper");
            throw null;
        }
        view2.setVisibility(0);
        View view3 = this.f76789o0ooOO0;
        if (view3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("toolBoxIconWrapper");
            throw null;
        }
        view3.setLayoutParams(marginLayoutParams);
        View view4 = this.f76790o0ooOOo;
        if (view4 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("toolBoxPanel");
            throw null;
        }
        view4.setAlpha(0.0f);
        View view5 = this.f76790o0ooOOo;
        if (view5 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("toolBoxPanel");
            throw null;
        }
        view5.setVisibility(8);
        View view6 = this.f76791o0ooOoO;
        if (view6 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("moveHandle");
            throw null;
        }
        view6.setAlpha(0.0f);
        getLayoutParams().width = getHeight();
        requestLayout();
    }

    public final int OooO0o(int i) {
        ViewParent parent = getParent();
        kotlin.jvm.internal.OooOOO0.OooO0o0(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        int width = ((ViewGroup) parent).getWidth();
        ViewParent parent2 = getParent();
        kotlin.jvm.internal.OooOOO0.OooO0o0(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
        int height = ((ViewGroup) parent2).getHeight();
        float x = getX() + (getWidth() / 2);
        float y = getY() + (getHeight() / 2);
        Object next = null;
        if (i != 1) {
            Iterator it = C34444Oooo0O0.OooO0oo(new C32443OooOOO(7, Float.valueOf(Math.abs(x))), new C32443OooOOO(1, Float.valueOf(Math.abs(y))), new C32443OooOOO(3, Float.valueOf(Math.abs(width - x))), new C32443OooOOO(5, Float.valueOf(Math.abs(height - y)))).entrySet().iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    float fFloatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                    do {
                        Object next2 = it.next();
                        float fFloatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                        if (Float.compare(fFloatValue, fFloatValue2) > 0) {
                            next = next2;
                            fFloatValue = fFloatValue2;
                        }
                    } while (it.hasNext());
                }
            }
            Map.Entry entry = (Map.Entry) next;
            if (entry != null) {
                return ((Number) entry.getKey()).intValue();
            }
            return 5;
        }
        float f = x * x;
        float f2 = y * y;
        float f3 = width - x;
        float f4 = f3 * f3;
        float f5 = height - y;
        float f6 = f5 * f5;
        Iterator it2 = C34444Oooo0O0.OooO0oo(new C32443OooOOO(0, Float.valueOf(f + f2)), new C32443OooOOO(2, Float.valueOf(f2 + f4)), new C32443OooOOO(4, Float.valueOf(f4 + f6)), new C32443OooOOO(6, Float.valueOf(f6 + f))).entrySet().iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                float fFloatValue3 = ((Number) ((Map.Entry) next).getValue()).floatValue();
                do {
                    Object next3 = it2.next();
                    float fFloatValue4 = ((Number) ((Map.Entry) next3).getValue()).floatValue();
                    if (Float.compare(fFloatValue3, fFloatValue4) > 0) {
                        next = next3;
                        fFloatValue3 = fFloatValue4;
                    }
                } while (it2.hasNext());
            }
        }
        Map.Entry entry2 = (Map.Entry) next;
        if (entry2 != null) {
            return ((Number) entry2.getKey()).intValue();
        }
        return 6;
    }

    public final boolean OooO0o0(float f, float f2) {
        return Math.abs(f - this.f76738OooOo0o) >= 10.0f || Math.abs(f2 - this.f76737OooOo) >= 10.0f || Math.abs(f - this.f76740OooOoO0) >= 10.0f || Math.abs(f2 - this.f76739OooOoO) >= 10.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C32443OooOOO<Integer, Integer> OooO0oO(int i) {
        int iOooO0o = o000000O.OooO0o(16);
        ViewParent parent = getParent();
        kotlin.jvm.internal.OooOOO0.OooO0o0(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        int width = ((ViewGroup) parent).getWidth();
        ViewParent parent2 = getParent();
        kotlin.jvm.internal.OooOOO0.OooO0o0(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
        int height = ((ViewGroup) parent2).getHeight();
        C32443OooOOO c32443OooOOO = this.state == 1 ? new C32443OooOOO(Integer.valueOf(o000000O.OooO0o(60)), Integer.valueOf(o000000O.OooO0o(60))) : new C32443OooOOO(Integer.valueOf(getNormalWidth()), Integer.valueOf(o000000O.OooO0o(70)));
        int iIntValue = ((Number) c32443OooOOO.f116638OooOo0o).intValue();
        int iIntValue2 = ((Number) c32443OooOOO.f116637OooOo).intValue();
        switch (i) {
            case 0:
                return new C32443OooOOO<>(Integer.valueOf(iOooO0o), Integer.valueOf(iOooO0o));
            case 1:
                Context context = getContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(context, "getContext(...)");
                Activity activityOooO00o = C28036OooO0O0.OooO00o(context);
                return (activityOooO00o != null && activityOooO00o.isInMultiWindowMode() && this.immersiveMode) ? new C32443OooOOO<>(Integer.valueOf((width - iIntValue) / 2), Integer.valueOf(o000000O.OooO0o(10))) : new C32443OooOOO<>(Integer.valueOf((width - iIntValue) / 2), 0);
            case 2:
                return new C32443OooOOO<>(Integer.valueOf((width - iIntValue) - iOooO0o), Integer.valueOf(iOooO0o));
            case 3:
                return new C32443OooOOO<>(Integer.valueOf(width - ((iIntValue + iIntValue2) / 2)), Integer.valueOf((height - iIntValue2) / 2));
            case 4:
                return new C32443OooOOO<>(Integer.valueOf((width - iIntValue) - iOooO0o), Integer.valueOf((height - iIntValue2) - iOooO0o));
            case 5:
                return new C32443OooOOO<>(Integer.valueOf((width - iIntValue) / 2), Integer.valueOf(height - iIntValue2));
            case 6:
                return new C32443OooOOO<>(Integer.valueOf(iOooO0o), Integer.valueOf((height - iIntValue2) - iOooO0o));
            case 7:
                return new C32443OooOOO<>(Integer.valueOf((-(iIntValue - iIntValue2)) / 2), Integer.valueOf((height - iIntValue2) / 2));
            default:
                return new C32443OooOOO<>(Integer.valueOf(iOooO0o), Integer.valueOf((height - iIntValue2) - iOooO0o));
        }
    }

    public final void OooO0oo(int i) {
        View view = this.f76791o0ooOoO;
        if (view == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("moveHandle");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.OooOOO0.OooO0o0(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.OooO00o oooO00o = (ConstraintLayout.OooO00o) layoutParams;
        View view2 = this.f76786o0OOO0o;
        if (view2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("toolBoxPanelWrapper");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        kotlin.jvm.internal.OooOOO0.OooO0o0(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.OooO00o oooO00o2 = (ConstraintLayout.OooO00o) layoutParams2;
        if (i == 1) {
            oooO00o2.f63876OooO = 0;
            View view3 = this.f76786o0OOO0o;
            if (view3 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("toolBoxPanelWrapper");
                throw null;
            }
            oooO00o.f63885OooOO0 = view3.getId();
            oooO00o.f63876OooO = -1;
            ((ViewGroup.MarginLayoutParams) oooO00o).topMargin = o000000O.OooO0o(-1);
        } else {
            oooO00o.f63876OooO = 0;
            ((ViewGroup.MarginLayoutParams) oooO00o).topMargin = 0;
            View view4 = this.f76791o0ooOoO;
            if (view4 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("moveHandle");
                throw null;
            }
            oooO00o2.f63885OooOO0 = view4.getId();
            oooO00o2.f63876OooO = -1;
        }
        View view5 = this.f76791o0ooOoO;
        if (view5 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("moveHandle");
            throw null;
        }
        view5.setLayoutParams(oooO00o);
        View view6 = this.f76786o0OOO0o;
        if (view6 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("toolBoxPanelWrapper");
            throw null;
        }
        view6.setLayoutParams(oooO00o2);
        View view7 = this.f76791o0ooOoO;
        if (view7 != null) {
            view7.setRotation(i == 1 ? 180.0f : 0.0f);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("moveHandle");
            throw null;
        }
    }

    public final OooOO0.OooO00o getColorPickerEventListener() {
        return this.colorPickerEventListener;
    }

    public final View.OnClickListener getColorSetFavoriteOnClick() {
        return this.colorSetFavoriteOnClick;
    }

    public final View.OnClickListener getColorSetOnClickListener() {
        return this.colorSetOnClickListener;
    }

    public final boolean getDualLinkFeature() {
        return this.dualLinkFeature;
    }

    public final OooO00o getEraserTypeListener() {
        return this.eraserTypeListener;
    }

    public final OooO0O0 getHlSettingsListener() {
        return this.hlSettingsListener;
    }

    public final boolean getImmersiveMode() {
        return this.immersiveMode;
    }

    public final OooO0OO getInkPenSettingChangedListener() {
        return this.inkPenSettingChangedListener;
    }

    public final InterfaceC23605OooO0Oo getLaserPenChangedListener() {
        return this.laserPenChangedListener;
    }

    public final InterfaceC23606OooO0o0 getLassoFilterListener() {
        return this.lassoFilterListener;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener getLayoutListener() {
        return null;
    }

    public final View.OnClickListener getOnInsertTextBoxClickListener() {
        return this.onInsertTextBoxClickListener;
    }

    public final OooOO0 getOnPositionChangedListener() {
        return null;
    }

    public final OooOO0O getOnStateChangedListener() {
        return null;
    }

    public final View.OnClickListener getPenActionButtonClickListener() {
        return this.penActionButtonClickListener;
    }

    public final View.OnClickListener getPenColorItemClickListener() {
        return this.penColorItemClickListener;
    }

    public final OooO0o getPenColorPickerListener() {
        return this.penColorPickerListener;
    }

    public final View.OnClickListener getPenItemClickListener() {
        return this.penItemClickListener;
    }

    public final OooOOO0 getPenSettingsCorrectToLineListener() {
        return this.penSettingsCorrectToLineListener;
    }

    public final OooOOO getPenSettingsFavoritesListener() {
        return this.penSettingsFavoritesListener;
    }

    public final OooOOOO getPenSettingsFillShapeWithColorListener() {
        return this.penSettingsFillShapeWithColorListener;
    }

    public final View.OnClickListener getPenWidthItemClickListener() {
        return this.penWidthItemClickListener;
    }

    public final InterfaceC23607OooO0oO getPenWidthSeekBarListener() {
        return this.penWidthSeekBarListener;
    }

    public final int getPosition() {
        return this.position;
    }

    public final int getState() {
        return this.state;
    }

    public final OooO getTapePenSettingChangedListener() {
        return this.tapePenSettingChangedListener;
    }

    public final InterfaceC23609OooOO0o getVectorPenChangedListener() {
        return this.vectorPenChangedListener;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Context context = getContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(context, "getContext(...)");
        int iIntValue = C28038OooO0Oo.OooO00o(context).f116638OooOo0o.intValue();
        Context context2 = getContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(context2, "getContext(...)");
        C29950OooO0o0 c29950OooO0o0 = new C29950OooO0o0(context2);
        this.f76765OoooOoO = c29950OooO0o0;
        C23612OooOOo0 c23612OooOOo0 = new C23612OooOOo0();
        c29950OooO0o0.f106365OooOO0O = c23612OooOOo0;
        Context context3 = getContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(context3, "getContext(...)");
        o0o00o0O.OooOO0O oooOO0O = new o0o00o0O.OooOO0O(context3);
        this.f76766OoooOoo = oooOO0O;
        oooOO0O.f106390OooO0o0 = c23612OooOOo0;
        Context context4 = getContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(context4, "getContext(...)");
        C29948OooO0Oo c29948OooO0Oo = new C29948OooO0Oo(context4);
        this.f76767Ooooo00 = c29948OooO0Oo;
        c29948OooO0Oo.f106341OooO0O0 = c23612OooOOo0;
        Context context5 = getContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(context5, "getContext(...)");
        C29947OooO0OO c29947OooO0OO = new C29947OooO0OO(context5);
        this.f76768Ooooo0o = c29947OooO0OO;
        c29947OooO0OO.f106339OooO0oO = new ViewOnClickListenerC26076OooO0o(this, 1);
        Context context6 = getContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(context6, "getContext(...)");
        C29951OooO0oO c29951OooO0oO = new C29951OooO0oO(context6);
        this.f76769OooooO0 = c29951OooO0oO;
        c29951OooO0oO.f106369OooO0o = c23612OooOOo0;
        Context context7 = getContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(context7, "getContext(...)");
        C29949OooO0o c29949OooO0o = new C29949OooO0o(context7);
        this.f76770OooooOO = c29949OooO0o;
        c29949OooO0o.f106355OooO0oO = c23612OooOOo0;
        Context context8 = getContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(context8, "getContext(...)");
        C29953OooOO0o c29953OooOO0o = new C29953OooOO0o(context8);
        this.f76771OooooOo = c29953OooOO0o;
        c29953OooOO0o.f106392OooO = c23612OooOOo0;
        this.f76764OoooOo0 = new C29901OooO0oo();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.pen_list);
        this.f76763OoooOOo = recyclerView;
        if (recyclerView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("penListView");
            throw null;
        }
        recyclerView.setAdapter(this.f76764OoooOo0);
        int iOooO0o = o000000O.OooO0o(5);
        RecyclerView recyclerView2 = this.f76763OoooOOo;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("penListView");
            throw null;
        }
        recyclerView2.addItemDecoration(new OooOo00(iOooO0o));
        this.f76764OoooOo0.f106080OooO0O0 = new ViewOnClickListenerC28526OooO0o0(this, 2);
        Context context9 = getContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(context9, "getContext(...)");
        this.f76774OoooooO = new o0o00Ooo.OooOO0(true, true, context9);
        Context context10 = getContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(context10, "getContext(...)");
        this.f76775Ooooooo = new o0o00Ooo.OooOO0(true, true, context10);
        C29904OooOOo c29904OooOOo = new C29904OooOOo();
        this.f76772Oooooo = c29904OooOOo;
        c29904OooOOo.f106100OooO0O0 = new o0OoO000.OooO0o(this, 2);
        RecyclerView recyclerView3 = (RecyclerView) findViewById(R.id.color_list);
        this.f76773Oooooo0 = recyclerView3;
        if (recyclerView3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("penColorListView");
            throw null;
        }
        recyclerView3.setAdapter(this.f76772Oooooo);
        RecyclerView recyclerView4 = this.f76773Oooooo0;
        if (recyclerView4 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("penColorListView");
            throw null;
        }
        RecyclerView.OooOOOO layoutManager = recyclerView4.getLayoutManager();
        kotlin.jvm.internal.OooOOO0.OooO0o0(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        int i = ((GridLayoutManager) layoutManager).f65751OooOo;
        int iOooO0o2 = iIntValue < o000000O.OooO0o(480) ? o000000O.OooO0o(3) : o000000O.OooO0o(7);
        RecyclerView recyclerView5 = this.f76773Oooooo0;
        if (recyclerView5 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("penColorListView");
            throw null;
        }
        recyclerView5.addItemDecoration(new C29895OooO0O0(i, iOooO0o2));
        ImageView imageView = (ImageView) findViewById(R.id.color_set_favorite);
        this.f76788o0OoOo0 = imageView;
        if (imageView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("colorSetFavorite");
            throw null;
        }
        imageView.setOnClickListener(new oo000o(this, 3));
        Context context11 = getContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(context11, "getContext(...)");
        this.f76777o00O0O = new C29952OooO0oo(context11);
        C29906OooOOoo c29906OooOOoo = new C29906OooOOoo();
        this.f76794ooOO = c29906OooOOoo;
        c29906OooOOoo.f106105OooO0O0 = new o0OOO0o(this, 3);
        RecyclerView recyclerView6 = (RecyclerView) findViewById(R.id.pen_width_list);
        if (recyclerView6 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("penWidthListView");
            throw null;
        }
        recyclerView6.setAdapter(this.f76794ooOO);
        Context context12 = getContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(context12, "getContext(...)");
        this.f76779o00Ooo = new com.orion.notein.p607ui.noteeditor.toolbox.OooO00o(context12);
        C29894OooO00o c29894OooO00o = new C29894OooO00o();
        this.f76778o00Oo0 = c29894OooO00o;
        c29894OooO00o.f106057OooO0OO = new o0Oo0oo(this, 2);
        this.f76780o00o0O = findViewById(R.id.cl_eraser_type);
        this.f76783o00ooo = (ImageView) findViewById(R.id.eraser_type_pixel);
        this.f76792oo000o = (ImageView) findViewById(R.id.eraser_type_stroke);
        this.f76782o00oO0o = (ImageView) findViewById(R.id.eraser_type_lasso);
        ImageView imageView2 = this.f76783o00ooo;
        if (imageView2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("eraserPixel");
            throw null;
        }
        imageView2.setOnClickListener(new o0OO00O(this, 4));
        ImageView imageView3 = this.f76792oo000o;
        if (imageView3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("eraserStroke");
            throw null;
        }
        imageView3.setOnClickListener(new oo0o0Oo(this, 1));
        ImageView imageView4 = this.f76782o00oO0o;
        if (imageView4 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("eraserLasso");
            throw null;
        }
        imageView4.setOnClickListener(new o0O0O00(this, 4));
        this.f76781o00oO0O = findViewById(R.id.lasso_type_list);
        ImageView imageView5 = (ImageView) findViewById(R.id.lasso_free);
        if (imageView5 != null) {
            imageView5.setOnClickListener(new ViewOnClickListenerC28296OooO0oo(this, 3));
        }
        ImageView imageView6 = (ImageView) findViewById(R.id.lasso_rect);
        if (imageView6 != null) {
            imageView6.setOnClickListener(new ViewOnClickListenerC28534OooOOoo(this, 3));
        }
        ImageView imageView7 = (ImageView) findViewById(R.id.lasso_capture);
        if (imageView7 != null) {
            imageView7.setOnClickListener(new o0OoO000.OooOo00(this, 2));
        }
        this.f76789o0ooOO0 = findViewById(R.id.toolbox_icon_wrapper);
        this.f76790o0ooOOo = findViewById(R.id.toolbox_panel);
        this.f76791o0ooOoO = findViewById(R.id.handle);
        this.f76786o0OOO0o = findViewById(R.id.toolbox_panel_wrapper);
        View view = this.f76789o0ooOO0;
        if (view == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("toolBoxIconWrapper");
            throw null;
        }
        Rect rect = new Rect(0, 0, o000000O.OooO0o(60), o000000O.OooO0o(60));
        View view2 = this.f76791o0ooOoO;
        if (view2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("moveHandle");
            throw null;
        }
        view.setTouchDelegate(new TouchDelegate(rect, view2));
        findViewById(R.id.iv_show_favorite_toolbox).setOnClickListener(new ViewOnClickListenerC28288OooO(this, 4));
        Context context13 = getContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(context13, "getContext(...)");
        if (!C28038OooO0Oo.OooO0O0(context13)) {
            post(new Runnable() { // from class: o0o00Oo.OooOO0O
                @Override // java.lang.Runnable
                public final void run() {
                    PenBox penBox = this.f106088OooOo0o;
                    View view3 = penBox.f76791o0ooOoO;
                    if (view3 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("moveHandle");
                        throw null;
                    }
                    Object parent = view3.getParent();
                    kotlin.jvm.internal.OooOOO0.OooO0o0(parent, "null cannot be cast to non-null type android.view.View");
                    View view4 = (View) parent;
                    View view5 = penBox.f76791o0ooOoO;
                    if (view5 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("moveHandle");
                        throw null;
                    }
                    int iOooO0o3 = o000000O.OooO0o(28);
                    int iOooO0o4 = o000000O.OooO0o(8);
                    Rect rect2 = new Rect();
                    view5.getHitRect(rect2);
                    rect2.left -= iOooO0o3;
                    rect2.top -= iOooO0o4;
                    rect2.right += iOooO0o3;
                    rect2.bottom += iOooO0o4;
                    View view6 = penBox.f76791o0ooOoO;
                    if (view6 != null) {
                        view4.setTouchDelegate(new TouchDelegate(rect2, view6));
                    } else {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("moveHandle");
                        throw null;
                    }
                }
            });
        }
        View view3 = this.f76791o0ooOoO;
        if (view3 != null) {
            view3.setOnTouchListener(new View.OnTouchListener() { // from class: o0o00Oo.OooOO0o
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view4, MotionEvent motionEvent) {
                    PenBox.OooO0O0(this.f106089OooOo0o, motionEvent);
                    return true;
                }
            });
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("moveHandle");
            throw null;
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        Log.d("ToolBox", "ToolBox onFocusChanged gainFocus " + z + ", status " + this.state);
        if (this.state == 0) {
            int i2 = this.position;
            if (i2 == 0 || i2 == 2 || i2 == 6 || i2 == 4) {
                setStateWithAnim(1);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f76741OooOoOO == 0) {
            this.f76741OooOoOO = getWidth();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View changedView, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(changedView, "changedView");
        super.onVisibilityChanged(changedView, i);
        if (this.position == 3) {
            setLayoutDirection(1);
        } else {
            setLayoutDirection(0);
        }
    }

    public final void setColorPickerEventListener(OooOO0.OooO00o oooO00o) {
        this.colorPickerEventListener = oooO00o;
        C23610OooOOOo c23610OooOOOo = new C23610OooOOOo(oooO00o);
        this.f76774OoooooO.f106167OooO = c23610OooOOOo;
        this.f76775Ooooooo.f106167OooO = c23610OooOOOo;
    }

    public final void setColorSetFavorite(boolean favorite) {
        if (favorite) {
            ImageView imageView = this.f76788o0OoOo0;
            if (imageView != null) {
                imageView.setImageResource(R.drawable.ic_ni_star_2_selected);
                return;
            } else {
                kotlin.jvm.internal.OooOOO0.OooOOOO("colorSetFavorite");
                throw null;
            }
        }
        ImageView imageView2 = this.f76788o0OoOo0;
        if (imageView2 != null) {
            imageView2.setImageResource(R.drawable.ic_ni_star_2_normal);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("colorSetFavorite");
            throw null;
        }
    }

    public final void setColorSetFavoriteOnClick(View.OnClickListener onClickListener) {
        this.colorSetFavoriteOnClick = onClickListener;
    }

    public final void setColorSetOnClickListener(View.OnClickListener onClickListener) {
        this.colorSetOnClickListener = onClickListener;
        o0o00Ooo.OooOO0 oooOO02 = this.f76774OoooooO;
        if (oooOO02 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("penColorPopupWindow");
            throw null;
        }
        oooOO02.f106173OooO0oO = onClickListener;
        o0o00Ooo.OooOO0 oooOO03 = this.f76775Ooooooo;
        if (oooOO03 != null) {
            oooOO03.f106173OooO0oO = onClickListener;
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("penColorPopupWindowInSidePen");
            throw null;
        }
    }

    public final void setCorrectToLine(boolean enabled) {
        C29950OooO0o0 c29950OooO0o0 = this.f76765OoooOoO;
        if (c29950OooO0o0 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("inkPenSettingPopupWindow");
            throw null;
        }
        c29950OooO0o0.OooO0o0(enabled);
        C29948OooO0Oo c29948OooO0Oo = this.f76767Ooooo00;
        if (c29948OooO0Oo != null) {
            c29948OooO0Oo.OooO0o0(enabled);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("hlSettingsPopupWindow");
            throw null;
        }
    }

    public final void setDualLinkFeature(boolean z) {
        this.dualLinkFeature = z;
    }

    public final void setEraserTypeListener(OooO00o oooO00o) {
        this.eraserTypeListener = oooO00o;
        C29947OooO0OO c29947OooO0OO = this.f76768Ooooo0o;
        if (c29947OooO0OO != null) {
            c29947OooO0OO.f106338OooO0o0 = oooO00o;
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("eraserSettingsPopupWindow");
            throw null;
        }
    }

    public final void setHlSettingsListener(OooO0O0 oooO0O0) {
        this.hlSettingsListener = oooO0O0;
        C29948OooO0Oo c29948OooO0Oo = this.f76767Ooooo00;
        if (c29948OooO0Oo != null) {
            c29948OooO0Oo.f106342OooO0OO = oooO0O0;
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("hlSettingsPopupWindow");
            throw null;
        }
    }

    public final void setImmersiveMode(boolean z) {
        this.immersiveMode = z;
    }

    public final void setInkPenSettingChangedListener(OooO0OO oooO0OO) {
        this.inkPenSettingChangedListener = oooO0OO;
        C29950OooO0o0 c29950OooO0o0 = this.f76765OoooOoO;
        if (c29950OooO0o0 != null) {
            c29950OooO0o0.f106362OooO0oO = oooO0OO;
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("inkPenSettingPopupWindow");
            throw null;
        }
    }

    public final void setLaserPenChangedListener(InterfaceC23605OooO0Oo interfaceC23605OooO0Oo) {
        this.laserPenChangedListener = interfaceC23605OooO0Oo;
        C29949OooO0o c29949OooO0o = this.f76770OooooOO;
        if (c29949OooO0o != null) {
            c29949OooO0o.f106354OooO0o0 = interfaceC23605OooO0Oo;
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("laserSettingsPopupWindow");
            throw null;
        }
    }

    public final void setLassoActivatedTextColor(Integer color) {
    }

    public final void setLassoFilterListener(InterfaceC23606OooO0o0 interfaceC23606OooO0o0) {
        this.lassoFilterListener = interfaceC23606OooO0o0;
        C29951OooO0oO c29951OooO0oO = this.f76769OooooO0;
        if (c29951OooO0oO != null) {
            c29951OooO0oO.f106368OooO0Oo = interfaceC23606OooO0o0;
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("lassoSettingsPopupWindow");
            throw null;
        }
    }

    public final void setOnInsertTextBoxClickListener(View.OnClickListener onClickListener) {
        this.onInsertTextBoxClickListener = onClickListener;
    }

    public final void setOnPositionChangedListener(OooOO0 oooOO02) {
    }

    public final void setOnStateChangedListener(OooOO0O oooOO0O) {
    }

    public final void setPenActionButtonClickListener(View.OnClickListener onClickListener) {
        this.penActionButtonClickListener = onClickListener;
    }

    public final void setPenColorItemClickListener(View.OnClickListener onClickListener) {
        this.penColorItemClickListener = onClickListener;
    }

    public final void setPenColorPickerListener(OooO0o oooO0o) {
        this.penColorPickerListener = oooO0o;
        o0o00Ooo.OooOO0 oooOO02 = this.f76774OoooooO;
        if (oooOO02 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("penColorPopupWindow");
            throw null;
        }
        oooOO02.f106174OooO0oo = oooO0o;
        o0o00Ooo.OooOO0 oooOO03 = this.f76775Ooooooo;
        if (oooOO03 != null) {
            oooOO03.f106174OooO0oo = oooO0o;
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("penColorPopupWindowInSidePen");
            throw null;
        }
    }

    public final void setPenItemClickListener(View.OnClickListener onClickListener) {
        this.penItemClickListener = onClickListener;
    }

    public final void setPenSettingsCorrectToLineListener(OooOOO0 oooOOO0) {
        this.penSettingsCorrectToLineListener = oooOOO0;
        C29950OooO0o0 c29950OooO0o0 = this.f76765OoooOoO;
        if (c29950OooO0o0 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("inkPenSettingPopupWindow");
            throw null;
        }
        c29950OooO0o0.f106356OooO = oooOOO0;
        C29948OooO0Oo c29948OooO0Oo = this.f76767Ooooo00;
        if (c29948OooO0Oo != null) {
            c29948OooO0Oo.f106343OooO0Oo = oooOOO0;
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("hlSettingsPopupWindow");
            throw null;
        }
    }

    public final void setPenSettingsFavoritesListener(OooOOO oooOOO) {
        this.penSettingsFavoritesListener = oooOOO;
        C29950OooO0o0 c29950OooO0o0 = this.f76765OoooOoO;
        if (c29950OooO0o0 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("inkPenSettingPopupWindow");
            throw null;
        }
        c29950OooO0o0.f106363OooO0oo = oooOOO;
        C29948OooO0Oo c29948OooO0Oo = this.f76767Ooooo00;
        if (c29948OooO0Oo == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("hlSettingsPopupWindow");
            throw null;
        }
        c29948OooO0Oo.f106345OooO0o0 = oooOOO;
        C29947OooO0OO c29947OooO0OO = this.f76768Ooooo0o;
        if (c29947OooO0OO == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("eraserSettingsPopupWindow");
            throw null;
        }
        c29947OooO0OO.f106337OooO0o = oooOOO;
        C29953OooOO0o c29953OooOO0o = this.f76771OooooOo;
        if (c29953OooOO0o == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("vectorPenSettingsPopupWindow");
            throw null;
        }
        c29953OooOO0o.f106398OooO0oO = oooOOO;
        C29951OooO0oO c29951OooO0oO = this.f76769OooooO0;
        if (c29951OooO0oO == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("lassoSettingsPopupWindow");
            throw null;
        }
        c29951OooO0oO.f106370OooO0o0 = oooOOO;
        C29949OooO0o c29949OooO0o = this.f76770OooooOO;
        if (c29949OooO0o != null) {
            c29949OooO0o.f106353OooO0o = oooOOO;
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("laserSettingsPopupWindow");
            throw null;
        }
    }

    public final void setPenSettingsFillShapeWithColorListener(OooOOOO oooOOOO) {
        this.penSettingsFillShapeWithColorListener = oooOOOO;
        C29953OooOO0o c29953OooOO0o = this.f76771OooooOo;
        if (c29953OooOO0o != null) {
            c29953OooOO0o.f106399OooO0oo = oooOOOO;
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("vectorPenSettingsPopupWindow");
            throw null;
        }
    }

    public final void setPenWidthItemClickListener(View.OnClickListener onClickListener) {
        this.penWidthItemClickListener = onClickListener;
    }

    public final void setPenWidthSeekBarListener(InterfaceC23607OooO0oO interfaceC23607OooO0oO) {
        this.penWidthSeekBarListener = interfaceC23607OooO0oO;
        C29952OooO0oo c29952OooO0oo = this.f76777o00O0O;
        if (c29952OooO0oo == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("penWidthPopupWindow");
            throw null;
        }
        c29952OooO0oo.f106375OooO0o0 = interfaceC23607OooO0oO;
        com.orion.notein.p607ui.noteeditor.toolbox.OooO00o oooO00o = this.f76779o00Ooo;
        if (oooO00o != null) {
            oooO00o.f76733OooO0o0 = interfaceC23607OooO0oO;
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("eraserWidthPopupWindow");
            throw null;
        }
    }

    public final void setPosition(int i) {
        this.position = i;
        if (i == 8 || i == 9 || i == 16 || i == 17) {
            return;
        }
        C22236OooO0Oo.OooO00o(i, "set position ", "ToolBox");
        if (this.f76794ooOO == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("penWidthAdapter");
            throw null;
        }
        OooOo.o0ooOO0(null);
        throw null;
    }

    public final void setStateWithAnim(int state) {
        if (this.state == state) {
            return;
        }
        this.state = state;
        this.f76785o0OO00O.cancel();
        if (state != 0) {
            if (state != 1) {
                return;
            }
            ViewParent parent = getParent();
            kotlin.jvm.internal.OooOOO0.OooO0o0(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).getWidth();
            o000000O.OooO0o0(16.0f);
            this.f76785o0OO00O = new AnimatorSet();
            return;
        }
        final int i = this.position;
        final float fOooO0o0 = o000000O.OooO0o0(16.0f);
        ViewParent parent2 = getParent();
        kotlin.jvm.internal.OooOOO0.OooO0o0(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
        final int width = ((ViewGroup) parent2).getWidth();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getWidth(), getNormalWidth());
        View view = this.f76790o0ooOOo;
        if (view == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("toolBoxPanel");
            throw null;
        }
        view.setVisibility(0);
        View view2 = this.f76790o0ooOOo;
        if (view2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("toolBoxPanel");
            throw null;
        }
        view2.setAlpha(1.0f);
        View view3 = this.f76789o0ooOO0;
        if (view3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("toolBoxIconWrapper");
            throw null;
        }
        view3.setVisibility(8);
        if (i == 16) {
            setRotation(90.0f);
        }
        if (i == 17) {
            setRotation(270.0f);
            setLayoutDirection(1);
        }
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o0o00Oo.OooOOO
            /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = PenBox.f76736o000OOo;
                int iIntValue = ((Integer) C28971o0OO00O.OooO00o(valueAnimator, TranslateLanguage.ITALIAN, "null cannot be cast to non-null type kotlin.Int")).intValue();
                int i3 = i;
                PenBox penBox = this;
                float f = fOooO0o0;
                if (i3 == 0) {
                    penBox.setX(f);
                } else if (i3 == 2 || i3 == 4) {
                    penBox.setX((width - f) - iIntValue);
                } else if (i3 == 6) {
                }
                penBox.getLayoutParams().width = iIntValue;
                penBox.requestLayout();
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(valueAnimatorOfInt);
        animatorSet.addListener(new C29905OooOOo0(this));
        animatorSet.start();
        this.f76785o0OO00O = animatorSet;
    }

    public final void setTapePenSettingChangedListener(OooO oooO) {
        this.tapePenSettingChangedListener = oooO;
        o0o00o0O.OooOO0O oooOO0O = this.f76766OoooOoo;
        if (oooOO0O != null) {
            oooOO0O.f106388OooO0Oo = oooO;
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("tapePenSettingPopupWindow");
            throw null;
        }
    }

    public final void setToolBoxVisible(boolean visible) {
        setVisibility(visible ? 0 : 8);
        if (this.state == 1 && visible) {
            setPositionWithOutAnim(this.position);
        }
    }

    public final void setVectorPenChangedListener(InterfaceC23609OooOO0o interfaceC23609OooOO0o) {
        this.vectorPenChangedListener = interfaceC23609OooOO0o;
        C29953OooOO0o c29953OooOO0o = this.f76771OooooOo;
        if (c29953OooOO0o != null) {
            c29953OooOO0o.f106396OooO0o = interfaceC23609OooOO0o;
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("vectorPenSettingsPopupWindow");
            throw null;
        }
    }

    public final void setVipBadgeVisible(boolean isVisible) {
        o0o00Ooo.OooOO0 oooOO02 = this.f76774OoooooO;
        if (oooOO02 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("penColorPopupWindow");
            throw null;
        }
        oooOO02.OooO0o0(isVisible);
        o0o00Ooo.OooOO0 oooOO03 = this.f76775Ooooooo;
        if (oooOO03 != null) {
            oooOO03.OooO0o0(isVisible);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("penColorPopupWindowInSidePen");
            throw null;
        }
    }
}
