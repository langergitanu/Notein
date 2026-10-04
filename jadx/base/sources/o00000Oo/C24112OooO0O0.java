package o00000Oo;

import OooooO0.C21293OooOO0;
import OooooOO.AbstractC21369oo000o;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32443OooOOO;
import oO0O00oo.OooOO0;

/* JADX INFO: renamed from: o00000Oo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24112OooO0O0 extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final float f81250OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final AbstractC21369oo000o f81251OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public C32443OooOOO<C21293OooOO0, ? extends Shader> f81252OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public long f81253OooOoO0 = C21293OooOO0.f61729OooO0OO;

    public C24112OooO0O0(AbstractC21369oo000o abstractC21369oo000o, float f) {
        this.f81251OooOo0o = abstractC21369oo000o;
        this.f81250OooOo = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        OooOOO0.OooO0oO(textPaint, "textPaint");
        float f = this.f81250OooOo;
        if (!Float.isNaN(f)) {
            textPaint.setAlpha(oO0O00O.OooO00o.OooO0O0(OooOO0.OooO0o0(f, 0.0f, 1.0f) * 255));
        }
        long j = this.f81253OooOoO0;
        if (j == C21293OooOO0.f61729OooO0OO) {
            return;
        }
        C32443OooOOO<C21293OooOO0, ? extends Shader> c32443OooOOO = this.f81252OooOoO;
        Shader shaderOooO0O0 = (c32443OooOOO == null || !C21293OooOO0.OooO00o(c32443OooOOO.f116638OooOo0o.f61731OooO00o, j)) ? this.f81251OooOo0o.OooO0O0() : (Shader) c32443OooOOO.f116637OooOo;
        textPaint.setShader(shaderOooO0O0);
        this.f81252OooOoO = new C32443OooOOO<>(new C21293OooOO0(this.f81253OooOoO0), shaderOooO0O0);
    }
}
