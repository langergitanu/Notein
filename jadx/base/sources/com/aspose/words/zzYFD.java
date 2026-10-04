package com.aspose.words;

import androidx.core.app.FrameMetricsAggregator;
import androidx.core.view.InputDeviceCompat;
import com.google.firebase.firestore.local.SQLitePersistence;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: loaded from: classes6.dex */
final class zzYFD {
    static boolean zzZD5 = false;
    private boolean zzXse;
    private boolean zzXsf;
    private boolean zzXsg;
    private zzYEM zzXwl;

    public zzYFD(zzYEM zzyem) {
        this.zzXwl = zzyem;
    }

    private void zz2(String str, boolean z) throws Exception {
        zzJ(str, z ? "1" : "0");
    }

    private void zz3(String str, boolean z) throws Exception {
        zz2(str, !this.zzXsf && z);
    }

    private void zzBL(String str) throws Exception {
        this.zzXwl.zzYfW().zzCC("\\sp");
        this.zzXwl.zzYfW().zzY6("\\sn", str);
        this.zzXwl.zzYfW().zzCC("\\sv");
    }

    private void zzH(int i, int i2, boolean z) throws Exception {
        this.zzXwl.zzYfW().write("(");
        this.zzXwl.zzYfW().write(i);
        this.zzXwl.zzYfW().write(",");
        this.zzXwl.zzYfW().write(i2);
        this.zzXwl.zzYfW().write(")");
        if (z) {
            return;
        }
        this.zzXwl.zzYfW().zzYj8();
    }

    private void zzJ(String str, String str2) throws Exception {
        if (com.aspose.words.internal.zzZYD.zzXk(str2)) {
            this.zzXwl.zzYfW().zzCC("\\sp");
            this.zzXwl.zzYfW().zzY6("\\sn", str);
            this.zzXwl.zzYfW().zzY6("\\sv", str2);
            this.zzXwl.zzYfW().zzYj3();
        }
    }

    private void zzV(String str, com.aspose.words.internal.zzPV zzpv) throws Exception {
        zzZ1(str, zzY0E.zzZD(zzpv));
    }

    private void zzVW(int i, int i2) throws Exception {
        zzVX(i, i2);
        short s = (short) i;
        this.zzXwl.zzYfW().zzG(s);
        this.zzXwl.zzYfW().zzG(s);
        this.zzXwl.zzYfW().zzG((short) i2);
    }

    private void zzVX(int i, int i2) throws Exception {
        this.zzXwl.zzYfW().zzFh();
        this.zzXwl.zzYfW().write(i2);
        this.zzXwl.zzYfW().zzYj8();
        this.zzXwl.zzYfW().write(i);
        this.zzXwl.zzYfW().zzYj8();
    }

    private void zzY(zzZLE[] zzzleArr) throws Exception {
        zzBL("fillShadeColors");
        zzVX(zzzleArr.length, 8);
        for (int i = 0; i < zzzleArr.length; i++) {
            zzZLE zzzle = zzzleArr[i];
            int iZzZD = zzY0E.zzZD(zzzle.zzYuy);
            int i2 = zzzle.zzZfb;
            boolean z = true;
            if (i != zzzleArr.length - 1) {
                z = false;
            }
            zzH(iZzZD, i2, z);
        }
        zzYfX();
    }

    private void zzYZ(ShapeBase shapeBase) throws Exception {
        int iZzY9L;
        int iZzY9L2;
        int iZzY9L3;
        int iZzY9L4;
        if (!shapeBase.isTopLevel() || shapeBase.isGroup()) {
            if (shapeBase.isTopLevel()) {
                iZzY9L4 = (int) shapeBase.zzY9L();
                iZzY9L = ((int) shapeBase.zzY9L()) + ((int) shapeBase.zzY9K());
                iZzY9L2 = (int) (shapeBase.zzY9L() >> 32);
                iZzY9L3 = ((int) (shapeBase.zzY9L() >> 32)) + ((int) (shapeBase.zzY9K() >>> 32));
            } else {
                zzZT3 zzzt3Zzg = zzZT3.zzg(shapeBase);
                double d = zzzt3Zzg.zzYJG;
                int i = (int) d;
                iZzY9L = (int) (d + zzzt3Zzg.zzYJE);
                double d2 = zzzt3Zzg.zzYJF;
                iZzY9L2 = (int) d2;
                iZzY9L3 = (int) (d2 + zzzt3Zzg.zzYJD);
                iZzY9L4 = i;
            }
            if (shapeBase.isGroup()) {
                zzZ1("groupLeft", (int) shapeBase.zzY9L());
                zzZ1("groupRight", ((int) shapeBase.zzY9L()) + ((int) shapeBase.zzY9K()));
                zzZ1("groupTop", (int) (shapeBase.zzY9L() >> 32));
                zzZ1("groupBottom", ((int) (shapeBase.zzY9L() >> 32)) + ((int) (shapeBase.zzY9K() >>> 32)));
            }
            if (shapeBase.isTopLevel()) {
                return;
            }
            zzZ1("relLeft", iZzY9L4);
            zzZ1("relRight", iZzY9L);
            zzZ1("relTop", iZzY9L2);
            zzZ1("relBottom", iZzY9L3);
        }
    }

    private zzYHZ zzYfW() {
        return this.zzXwl.zzYfW();
    }

    private void zzYfX() throws Exception {
        this.zzXwl.zzYfW().zzYj3();
        this.zzXwl.zzYfW().zzYj3();
    }

    private void zzZ(String str, zzYM5[] zzym5Arr) throws Exception {
        zzBL(str);
        zzVX(zzym5Arr.length, 8);
        for (int i = 0; i < zzym5Arr.length; i++) {
            zzYM5 zzym5 = zzym5Arr[i];
            int iZzZ = zzZU1.zzZ(zzym5.zzYnG());
            int iZzZ2 = zzZU1.zzZ(zzym5.zzYnF());
            boolean z = true;
            if (i != zzym5Arr.length - 1) {
                z = false;
            }
            zzH(iZzZ, iZzZ2, z);
        }
        zzYfX();
    }

    private void zzZ0(ShapeBase shapeBase) throws Exception {
        String hRef = shapeBase.getHRef();
        zzBL("pihlShape");
        this.zzXwl.zzYfW().zzCC("\\*\\hl");
        this.zzXwl.zzYfW().zzY6("\\hlsrc", com.aspose.words.internal.zzZVR.zzWH(hRef));
        this.zzXwl.zzYfW().zzY6("\\hlloc", com.aspose.words.internal.zzZVR.zzWG(hRef));
        this.zzXwl.zzYfW().zzY6("\\hlfr", hRef);
        this.zzXwl.zzYfW().zzYj3();
        zzYfX();
    }

    private void zzZ1(ShapeBase shapeBase) throws Exception {
        if (shapeBase.canHaveImage()) {
            Shape shape = (Shape) shapeBase;
            ImageData imageData = shape.getImageData();
            if (imageData.isLink()) {
                zzJ("pibName", imageData.getSourceFullName());
                zzZ1("pibFlags", imageData.isLinkOnly() ? 14 : 10);
            } else {
                zzJ("pibName", imageData.getTitle());
            }
            if (imageData.zzZjT() && !shapeBase.isInline()) {
                zzBL("pib");
                new zzYFX(this.zzXwl, shape).zzX(false, false, 255);
                zzYfX();
            }
        }
    }

    private void zzZj(int i, boolean z) throws Exception {
        this.zzXwl.zzYfW().write(i);
        if (z) {
            return;
        }
        this.zzXwl.zzYfW().zzYj8();
    }

    private void zzZk(int i, boolean z) throws Exception {
        zz2(z ? "fFlipH" : "fRelFlipH", i == 1 || i == 3);
        zz2(z ? "fFlipV" : "fRelFlipV", i == 2 || i == 3);
    }

    private void zznV(int i) throws Exception {
        if (i != -2) {
            if (i == -1) {
                return;
            }
            if (i != 201) {
                zzZ1("shapeType", i);
                return;
            }
        }
        zzZ1("shapeType", 75);
    }

    public final void zzW(ShapeBase shapeBase, boolean z) throws Exception {
        this.zzXse = true;
        zzV(shapeBase, z);
        this.zzXsf = shapeBase.zzY9y();
        zzYC3 zzyc3ZzYvW = shapeBase.zzYvW();
        for (int i = 0; i < zzyc3ZzYvW.getCount(); i++) {
            int iZzT3 = zzyc3ZzYvW.zzT3(i);
            Object objZzVY = zzyc3ZzYvW.zzVY(i);
            switch (iZzT3) {
                case 4:
                    zzZ1("rotation", ((Integer) objZzVY).intValue());
                    break;
                case 119:
                    zz3("fLockRotation", ((Boolean) objZzVY).booleanValue());
                    break;
                case 120:
                    zz3("fLockAspectRatio", ((Boolean) objZzVY).booleanValue());
                    break;
                case 121:
                    zz3("fLockPosition", ((Boolean) objZzVY).booleanValue());
                    break;
                case 122:
                    zz3("fLockAgainstSelect", ((Boolean) objZzVY).booleanValue());
                    break;
                case 123:
                    zz3("fLockCropping", ((Boolean) objZzVY).booleanValue());
                    break;
                case 124:
                    zz3("fLockVerticies", ((Boolean) objZzVY).booleanValue());
                    break;
                case 125:
                    zz3("fLockText", ((Boolean) objZzVY).booleanValue());
                    break;
                case 126:
                    zz3("fLockAdjustHandles", ((Boolean) objZzVY).booleanValue());
                    break;
                case 127:
                    zz3("fLockAgainstGrouping", ((Boolean) objZzVY).booleanValue());
                    break;
                case 128:
                    zzZ1("lTxid", ((Integer) objZzVY).intValue());
                    break;
                case 129:
                    zzZ1("dxTextLeft", ((Integer) objZzVY).intValue());
                    break;
                case 130:
                    zzZ1("dyTextTop", ((Integer) objZzVY).intValue());
                    break;
                case 131:
                    zzZ1("dxTextRight", ((Integer) objZzVY).intValue());
                    break;
                case 132:
                    zzZ1("dyTextBottom", ((Integer) objZzVY).intValue());
                    break;
                case 133:
                    zzZ1("WrapText", com.aspose.words.internal.zzZQB.zz2(objZzVY));
                    break;
                case 134:
                    zzZ1("scaleText", ((Integer) objZzVY).intValue());
                    break;
                case 135:
                    zzZ1("anchorText", com.aspose.words.internal.zzZQB.zz2(objZzVY));
                    break;
                case 136:
                    zzZ1("txflTextFlow", com.aspose.words.internal.zzZQB.zz2(objZzVY));
                    break;
                case 137:
                    zzZ1("cdirFont", com.aspose.words.internal.zzZQB.zz2(objZzVY));
                    break;
                case 138:
                    zzZ1("hspNext", ((Integer) objZzVY).intValue());
                    break;
                case 391:
                    zzJ("fillBlipName", (String) objZzVY);
                    break;
                case 405:
                    zzZ1("fillDztype", com.aspose.words.internal.zzZQB.zz2(objZzVY));
                    break;
                case 414:
                    zzZ1("fillcolorext", zzY0E.zzZD((com.aspose.words.internal.zzPV) objZzVY));
                    break;
                case 415:
                case 417:
                case 421:
                case 422:
                case 476:
                case 480:
                case 533:
                case 537:
                case 652:
                case 663:
                case 666:
                case 779:
                case 898:
                case 904:
                case 938:
                case 944:
                case 949:
                case 951:
                case EditingLanguage.KAZAKH /* 1087 */:
                case 1282:
                case 1283:
                case 1855:
                case EditingLanguage.ARABIC_LIBYA /* 4097 */:
                case InputDeviceCompat.SOURCE_TOUCHSCREEN /* 4098 */:
                case 4099:
                case 4102:
                case EditingLanguage.GERMAN_LUXEMBOURG /* 4103 */:
                case 4104:
                case EditingLanguage.SPANISH_GUATEMALA /* 4106 */:
                case 4107:
                case EditingLanguage.FRENCH_SWITZERLAND /* 4108 */:
                case 4109:
                case 4112:
                case 4113:
                case 4121:
                case EditingLanguage.CROATIAN_BOZNIA_AND_HERZEGOVINA /* 4122 */:
                    break;
                case 416:
                    zzZ1("fillcolorextmod", zzY0E.zzhG(((Integer) objZzVY).intValue()));
                    break;
                case 418:
                    zzZ1("fillbackcolorext", zzY0E.zzZD((com.aspose.words.internal.zzPV) objZzVY));
                    break;
                case 420:
                    zzZ1("fillbackcolorextmod", zzY0E.zzhG(((Integer) objZzVY).intValue()));
                    break;
                case 441:
                    zz2("fRecolorFillAsPicture", ((Boolean) objZzVY).booleanValue());
                    break;
                case 442:
                    zz2("fUseShapeAnchor", ((Boolean) objZzVY).booleanValue());
                    break;
                case 443:
                    if (this.zzXse) {
                        zz2("fFilled", ((Boolean) objZzVY).booleanValue());
                    }
                    break;
                case 444:
                    zz2("fHitTestFill", ((Boolean) objZzVY).booleanValue());
                    break;
                case 445:
                    zz2("fillShape", ((Boolean) objZzVY).booleanValue());
                    break;
                case 446:
                    zz2("fillUseRect", ((Boolean) objZzVY).booleanValue());
                    break;
                case 447:
                    zz2("fNoFillHitTest", ((Boolean) objZzVY).booleanValue());
                    break;
                case 448:
                    zzV("lineColor", (com.aspose.words.internal.zzPV) objZzVY);
                    break;
                case 449:
                    zzZ1("lineOpacity", ((Integer) objZzVY).intValue());
                    break;
                case 450:
                    zzV("lineBackColor", (com.aspose.words.internal.zzPV) objZzVY);
                    break;
                case 452:
                    zzZ1("lineType", com.aspose.words.internal.zzZQB.zz2(objZzVY));
                    break;
                case 454:
                    zzJ("lineFillBlipName", (String) objZzVY);
                    break;
                case 456:
                    zzZ1("lineFillWidth", ((Integer) objZzVY).intValue());
                    break;
                case 457:
                    zzZ1("lineFillHeight", ((Integer) objZzVY).intValue());
                    break;
                case 458:
                    zzZ1("lineFillDztype", com.aspose.words.internal.zzZQB.zz2(objZzVY));
                    break;
                case 459:
                    zzZ1("lineWidth", ((Integer) objZzVY).intValue());
                    break;
                case 460:
                    zzZ1("lineMiterLimit", ((Integer) objZzVY).intValue());
                    break;
                case 461:
                    zzZ1("lineStyle", com.aspose.words.internal.zzZQB.zz2(objZzVY));
                    break;
                case 462:
                    zzZ1("lineDashing", com.aspose.words.internal.zzZQB.zz2(objZzVY));
                    break;
                case 464:
                    zzZ1("lineStartArrowhead", com.aspose.words.internal.zzZQB.zz2(objZzVY));
                    break;
                case 465:
                    zzZ1("lineEndArrowhead", com.aspose.words.internal.zzZQB.zz2(objZzVY));
                    break;
                case 466:
                    zzZ1("lineStartArrowWidth", com.aspose.words.internal.zzZQB.zz2(objZzVY));
                    break;
                case 467:
                    zzZ1("lineStartArrowLength", com.aspose.words.internal.zzZQB.zz2(objZzVY));
                    break;
                case 468:
                    zzZ1("lineEndArrowWidth", com.aspose.words.internal.zzZQB.zz2(objZzVY));
                    break;
                case 469:
                    zzZ1("lineEndArrowLength", com.aspose.words.internal.zzZQB.zz2(objZzVY));
                    break;
                case 470:
                    zzZ1("lineJoinStyle", com.aspose.words.internal.zzZQB.zz2(objZzVY));
                    break;
                case 471:
                    zzZ1("lineEndCapStyle", com.aspose.words.internal.zzZQB.zz2(objZzVY));
                    break;
                case 473:
                    zzZ1("linecolorext", zzY0E.zzZD((com.aspose.words.internal.zzPV) objZzVY));
                    break;
                case 475:
                    zzZ1("linecolorextmod", zzY0E.zzhG(((Integer) objZzVY).intValue()));
                    break;
                case 477:
                    zzZ1("linebackcolorext", zzY0E.zzZD((com.aspose.words.internal.zzPV) objZzVY));
                    break;
                case 479:
                    zzZ1("linebackcolorextmod", zzY0E.zzhG(((Integer) objZzVY).intValue()));
                    break;
                case 507:
                    zz2("fArrowheadsOK", ((Boolean) objZzVY).booleanValue());
                    break;
                case 508:
                    zz2("fLine", ((Boolean) objZzVY).booleanValue());
                    break;
                case 509:
                    zz2("fHitTestLine", ((Boolean) objZzVY).booleanValue());
                    break;
                case FrameMetricsAggregator.EVERY_DURATION /* 511 */:
                    zz2("fNoLineDrawDash", ((Boolean) objZzVY).booleanValue());
                    break;
                case 512:
                    zzZ1("shadowType", com.aspose.words.internal.zzZQB.zz2(objZzVY));
                    break;
                case InputDeviceCompat.SOURCE_DPAD /* 513 */:
                    zzV("shadowColor", (com.aspose.words.internal.zzPV) objZzVY);
                    break;
                case 514:
                    zzV("shadowHighlight", (com.aspose.words.internal.zzPV) objZzVY);
                    break;
                case 515:
                    zzZ1("shadowCrMod", ((Integer) objZzVY).intValue());
                    break;
                case 516:
                    zzZ1("shadowOpacity", ((Integer) objZzVY).intValue());
                    break;
                case 517:
                    zzZ1("shadowOffsetX", ((Integer) objZzVY).intValue());
                    break;
                case 518:
                    zzZ1("shadowOffsetY", ((Integer) objZzVY).intValue());
                    break;
                case 519:
                    zzZ1("shadowSecondOffsetX", ((Integer) objZzVY).intValue());
                    break;
                case 520:
                    zzZ1("shadowSecondOffsetY", ((Integer) objZzVY).intValue());
                    break;
                case 521:
                    zzZ1("shadowScaleXToX", ((Integer) objZzVY).intValue());
                    break;
                case 522:
                    zzZ1("shadowScaleYToX", ((Integer) objZzVY).intValue());
                    break;
                case 523:
                    zzZ1("shadowScaleXToY", ((Integer) objZzVY).intValue());
                    break;
                case 524:
                    zzZ1("shadowScaleYToY", ((Integer) objZzVY).intValue());
                    break;
                case 525:
                    zzZ1("shadowPerspectiveX", ((Integer) objZzVY).intValue());
                    break;
                case 526:
                    zzZ1("shadowPerspectiveY", ((Integer) objZzVY).intValue());
                    break;
                case 527:
                    zzZ1("shadowWeight", ((Integer) objZzVY).intValue());
                    break;
                case 528:
                    zzZ1("shadowOriginX", ((Integer) objZzVY).intValue());
                    break;
                case 529:
                    zzZ1("shadowOriginY", ((Integer) objZzVY).intValue());
                    break;
                case 574:
                    zz2("fShadow", ((Boolean) objZzVY).booleanValue());
                    break;
                case 575:
                    zz2("fShadowObscured", ((Boolean) objZzVY).booleanValue());
                    break;
                case 576:
                    zzZ1("perspectiveType", com.aspose.words.internal.zzZQB.zz2(objZzVY));
                    break;
                case 577:
                    zzZ1("perspectiveOffsetX", ((Integer) objZzVY).intValue());
                    break;
                case 578:
                    zzZ1("perspectiveOffsetY", ((Integer) objZzVY).intValue());
                    break;
                case 579:
                    zzZ1("perspectiveScaleXToX", ((Integer) objZzVY).intValue());
                    break;
                case 580:
                    zzZ1("perspectiveScaleYToX", ((Integer) objZzVY).intValue());
                    break;
                case 581:
                    zzZ1("perspectiveScaleXToY", ((Integer) objZzVY).intValue());
                    break;
                case 582:
                    zzZ1("perspectiveScaleYToY", ((Integer) objZzVY).intValue());
                    break;
                case 583:
                    zzZ1("perspectivePerspectiveX", ((Integer) objZzVY).intValue());
                    break;
                case 584:
                    zzZ1("perspectivePerspectiveY", ((Integer) objZzVY).intValue());
                    break;
                case 585:
                    zzZ1("perspectiveWeight", ((Integer) objZzVY).intValue());
                    break;
                case 586:
                    zzZ1("perspectiveOriginX", ((Integer) objZzVY).intValue());
                    break;
                case 587:
                    zzZ1("perspectiveOriginY", ((Integer) objZzVY).intValue());
                    break;
                case 639:
                    zz2("fPerspective", ((Boolean) objZzVY).booleanValue());
                    break;
                case 640:
                    zzZ1("c3DSpecularAmt", ((Integer) objZzVY).intValue());
                    break;
                case 641:
                    zzZ1("c3DDiffuseAmt", ((Integer) objZzVY).intValue());
                    break;
                case 642:
                    zzZ1("c3DShininess", ((Integer) objZzVY).intValue());
                    break;
                case 643:
                    zzZ1("c3DEdgeThickness", ((Integer) objZzVY).intValue());
                    break;
                case 644:
                    zzZ1("c3DExtrudeForward", ((Integer) objZzVY).intValue());
                    break;
                case 645:
                    zzZ1("c3DExtrudeBackward", ((Integer) objZzVY).intValue());
                    break;
                case 646:
                    zzZ1("c3DExtrudePlane", com.aspose.words.internal.zzZQB.zz2(objZzVY));
                    break;
                case 647:
                    zzV("c3DExtrusionColor", (com.aspose.words.internal.zzPV) objZzVY);
                    break;
                case 648:
                    zzZ1("c3DCrMod", ((Integer) objZzVY).intValue());
                    break;
                case ALERT_VALUE:
                    zz2("f3D", ((Boolean) objZzVY).booleanValue());
                    break;
                case 701:
                    zz2("fc3DMetallic", ((Boolean) objZzVY).booleanValue());
                    break;
                case 702:
                    zz2("fc3DUseExtrusionColor", ((Boolean) objZzVY).booleanValue());
                    break;
                case 703:
                    zz2("fc3DLightFace", ((Boolean) objZzVY).booleanValue());
                    break;
                case 704:
                    zzZ1("c3DYRotationAngle", ((Integer) objZzVY).intValue());
                    break;
                case 705:
                    zzZ1("c3DXRotationAngle", ((Integer) objZzVY).intValue());
                    break;
                case 706:
                    zzZ1("c3DRotationAxisX", ((Integer) objZzVY).intValue());
                    break;
                case 707:
                    zzZ1("c3DRotationAxisY", ((Integer) objZzVY).intValue());
                    break;
                case 708:
                    zzZ1("c3DRotationAxisZ", ((Integer) objZzVY).intValue());
                    break;
                case 709:
                    zzZ1("c3DRotationAngle", ((Integer) objZzVY).intValue());
                    break;
                case 710:
                    zzZ1("c3DRotationCenterX", ((Integer) objZzVY).intValue());
                    break;
                case 711:
                    zzZ1("c3DRotationCenterY", ((Integer) objZzVY).intValue());
                    break;
                case 712:
                    zzZ1("c3DRotationCenterZ", ((Integer) objZzVY).intValue());
                    break;
                case 713:
                    zzZ1("c3DRenderMode", com.aspose.words.internal.zzZQB.zz2(objZzVY));
                    break;
                case 714:
                    zzZ1("c3DTolerance", ((Integer) objZzVY).intValue());
                    break;
                case 715:
                    zzZ1("c3DXViewpoint", ((Integer) objZzVY).intValue());
                    break;
                case 716:
                    zzZ1("c3DYViewpoint", ((Integer) objZzVY).intValue());
                    break;
                case 717:
                    zzZ1("c3DZViewpoint", ((Integer) objZzVY).intValue());
                    break;
                case 718:
                    zzZ1("c3DOriginX", ((Integer) objZzVY).intValue());
                    break;
                case 719:
                    zzZ1("c3DOriginY", ((Integer) objZzVY).intValue());
                    break;
                case 720:
                    zzZ1("c3DSkewAngle", ((Integer) objZzVY).intValue());
                    break;
                case 721:
                    zzZ1("c3DSkewAmount", ((Integer) objZzVY).intValue());
                    break;
                case 722:
                    zzZ1("c3DAmbientIntensity", ((Integer) objZzVY).intValue());
                    break;
                case 723:
                    zzZ1("c3DKeyX", ((Integer) objZzVY).intValue());
                    break;
                case 724:
                    zzZ1("c3DKeyY", ((Integer) objZzVY).intValue());
                    break;
                case 725:
                    zzZ1("c3DKeyZ", ((Integer) objZzVY).intValue());
                    break;
                case 726:
                    zzZ1("c3DKeyIntensity", ((Integer) objZzVY).intValue());
                    break;
                case 727:
                    zzZ1("c3DFillX", ((Integer) objZzVY).intValue());
                    break;
                case 728:
                    zzZ1("c3DFillY", ((Integer) objZzVY).intValue());
                    break;
                case 729:
                    zzZ1("c3DFillZ", ((Integer) objZzVY).intValue());
                    break;
                case 730:
                    zzZ1("c3DFillIntensity", ((Integer) objZzVY).intValue());
                    break;
                case 763:
                    zz2("fc3DConstrainRotation", ((Boolean) objZzVY).booleanValue());
                    break;
                case 764:
                    zz2("fC3DRotationCenterAuto", ((Boolean) objZzVY).booleanValue());
                    break;
                case 765:
                    zz2("fc3DParallel", ((Boolean) objZzVY).booleanValue());
                    break;
                case 766:
                    zz2("fc3DKeyHarsh", ((Boolean) objZzVY).booleanValue());
                    break;
                case 767:
                    zz2("fc3DFillHarsh", ((Boolean) objZzVY).booleanValue());
                    break;
                case 771:
                    zzZ1("cxstyle", com.aspose.words.internal.zzZQB.zz2(objZzVY));
                    break;
                case 772:
                    zzZ1("bWMode", com.aspose.words.internal.zzZQB.zz2(objZzVY));
                    break;
                case 773:
                    zzZ1("bWModePureBW", com.aspose.words.internal.zzZQB.zz2(objZzVY));
                    break;
                case 774:
                    zzZ1("bWModeBW", com.aspose.words.internal.zzZQB.zz2(objZzVY));
                    break;
                case 777:
                    zzZ1("dgmLayout", com.aspose.words.internal.zzZQB.zz2(objZzVY));
                    break;
                case 778:
                    zzZ1("dgmNodeKind", com.aspose.words.internal.zzZQB.zz2(objZzVY));
                    break;
                case 826:
                    zz2("fOleIcon", ((Boolean) objZzVY).booleanValue());
                    break;
                case 827:
                    zz2("fPreferRelativeResize", ((Boolean) objZzVY).booleanValue());
                    break;
                case 828:
                    zz3("fLockShapeType", ((Boolean) objZzVY).booleanValue());
                    break;
                case 830:
                    zz2("fDeleteAttachedObject", ((Boolean) objZzVY).booleanValue());
                    break;
                case 832:
                    zzZ1("spcot", com.aspose.words.internal.zzZQB.zz2(objZzVY));
                    break;
                case 833:
                    zzZ1("dxyCalloutGap", ((Integer) objZzVY).intValue());
                    break;
                case 834:
                    zzZ1("spcoa", com.aspose.words.internal.zzZQB.zz2(objZzVY));
                    break;
                case 835:
                    zzZ1("spcod", com.aspose.words.internal.zzZQB.zz2(objZzVY));
                    break;
                case 836:
                    zzZ1("dxyCalloutDropSpecified", ((Integer) objZzVY).intValue());
                    break;
                case 837:
                    zzZ1("dxyCalloutLengthSpecified", ((Integer) objZzVY).intValue());
                    break;
                case 889:
                    zz2("fCallout", ((Boolean) objZzVY).booleanValue());
                    break;
                case 890:
                    zz2("fCalloutAccentBar", ((Boolean) objZzVY).booleanValue());
                    break;
                case 891:
                    zz2("fCalloutTextBorder", ((Boolean) objZzVY).booleanValue());
                    break;
                case 892:
                    zz2("fCalloutMinusX", ((Boolean) objZzVY).booleanValue());
                    break;
                case 893:
                    zz2("fCalloutMinusY", ((Boolean) objZzVY).booleanValue());
                    break;
                case 894:
                    zz2("fCalloutDropAuto", ((Boolean) objZzVY).booleanValue());
                    break;
                case 895:
                    zz2("fCalloutLengthSpecified", ((Boolean) objZzVY).booleanValue());
                    break;
                case 896:
                    zzJ("wzName", (String) objZzVY);
                    break;
                case 897:
                    zzJ("wzDescription", ShapeBase.zzY1(shapeBase.getTitle(), (String) objZzVY));
                    break;
                case 899:
                    zzZ("pWrapPolygonVertices", (zzYM5[]) objZzVY);
                    break;
                case SQLitePersistence.MAX_ARGS /* 900 */:
                    if (shapeBase.isTopLevel()) {
                        zzZ1("dxWrapDistLeft", ((Integer) objZzVY).intValue());
                    }
                    break;
                case 901:
                    if (shapeBase.isTopLevel()) {
                        zzZ1("dyWrapDistTop", ((Integer) objZzVY).intValue());
                    }
                    break;
                case 902:
                    if (shapeBase.isTopLevel()) {
                        zzZ1("dxWrapDistRight", ((Integer) objZzVY).intValue());
                    }
                    break;
                case 903:
                    if (shapeBase.isTopLevel()) {
                        zzZ1("dyWrapDistBottom", ((Integer) objZzVY).intValue());
                    }
                    break;
                case 909:
                    zzJ("wzTooltip", (String) objZzVY);
                    break;
                case 910:
                    zzJ("wzScript", (String) objZzVY);
                    break;
                case 911:
                    if (shapeBase.isTopLevel()) {
                        zzZ1("posh", com.aspose.words.internal.zzZQB.zz2(objZzVY));
                    }
                    break;
                case 912:
                    if (shapeBase.isTopLevel()) {
                        zzZ1("posrelh", com.aspose.words.internal.zzZQB.zz2(objZzVY));
                    }
                    break;
                case 913:
                    if (shapeBase.isTopLevel()) {
                        zzZ1("posv", com.aspose.words.internal.zzZQB.zz2(objZzVY));
                    }
                    break;
                case 914:
                    if (shapeBase.isTopLevel()) {
                        zzZ1("posrelv", com.aspose.words.internal.zzZQB.zz2(objZzVY));
                    }
                    break;
                case 915:
                    zzZ1("pctHR", ((Integer) objZzVY).intValue());
                    break;
                case 916:
                    zzZ1("alignHR", com.aspose.words.internal.zzZQB.zz2(objZzVY));
                    break;
                case 919:
                    zzJ("wzScriptExtAttr", (String) objZzVY);
                    break;
                case 920:
                    zzZ1("scriptLang", ((Integer) objZzVY).intValue());
                    break;
                case 922:
                    zzJ("wzScriptLangAttr", (String) objZzVY);
                    break;
                case 923:
                    zzV("borderTopColor", (com.aspose.words.internal.zzPV) objZzVY);
                    break;
                case 924:
                    zzV("borderLeftColor", (com.aspose.words.internal.zzPV) objZzVY);
                    break;
                case 925:
                    zzV("borderBottomColor", (com.aspose.words.internal.zzPV) objZzVY);
                    break;
                case 926:
                    zzV("borderRightColor", (com.aspose.words.internal.zzPV) objZzVY);
                    break;
                case 945:
                    zz2("fIsBullet", ((Boolean) objZzVY).booleanValue());
                    break;
                case 946:
                    zz2("fStandardHR", ((Boolean) objZzVY).booleanValue());
                    break;
                case 947:
                    zz2("fNoshadeHR", ((Boolean) objZzVY).booleanValue());
                    break;
                case 948:
                    boolean zBooleanValue = ((Boolean) objZzVY).booleanValue();
                    zz2("fHorizRule", zBooleanValue);
                    if (zBooleanValue) {
                        zzZ1("dxHeightHR", com.aspose.words.internal.zzSA.zzr(shapeBase.getHeight()));
                        zzZ1("dxWidthHR", com.aspose.words.internal.zzSA.zzr(shapeBase.getWidth()));
                    }
                    break;
                case 950:
                    if (shapeBase.isTopLevel()) {
                        zz2("fAllowOverlap", ((Boolean) objZzVY).booleanValue());
                    }
                    break;
                case 952:
                    zz2("fScriptAnchor", ((Boolean) objZzVY).booleanValue());
                    break;
                case 953:
                    zz2("fEditedWrap", ((Boolean) objZzVY).booleanValue());
                    break;
                case 954:
                    if (shapeBase.isTopLevel()) {
                        zz2("fBehindDocument", ((Boolean) objZzVY).booleanValue());
                    }
                    break;
                case 955:
                    zz2("fOnDblClickNotify", ((Boolean) objZzVY).booleanValue());
                    break;
                case 956:
                    zz2("fIsButton", ((Boolean) objZzVY).booleanValue());
                    break;
                case 957:
                    zz2("fOneD", ((Boolean) objZzVY).booleanValue());
                    break;
                case 958:
                    zz2("fHidden", ((Boolean) objZzVY).booleanValue());
                    break;
                case 959:
                    zz2("fPrint", ((Boolean) objZzVY).booleanValue());
                    break;
                case 1280:
                    if (((Integer) objZzVY).intValue() >= 0) {
                        zzZ1("dgmt", com.aspose.words.internal.zzZQB.zz2(objZzVY));
                    }
                    break;
                case 1281:
                    zzZ1("dgmtStyle", ((Integer) objZzVY).intValue());
                    break;
                case 1284:
                    zzZ((zzJW[]) objZzVY);
                    break;
                case 1285:
                    zzZ1("dgmScaleX", ((Integer) objZzVY).intValue());
                    break;
                case 1286:
                    zzZ1("dgmScaleY", ((Integer) objZzVY).intValue());
                    break;
                case 1287:
                    zzZ1("dgmDefaultFontSize", ((Integer) objZzVY).intValue());
                    break;
                case 1288:
                    zzW("dgmConstrainBounds", (int[]) objZzVY);
                    break;
                case 1340:
                    zz2("fDoFormat", ((Boolean) objZzVY).booleanValue());
                    break;
                case 1341:
                    zz2("fReverse", ((Boolean) objZzVY).booleanValue());
                    break;
                case 1342:
                    zz2("fDoLayout", ((Boolean) objZzVY).booleanValue());
                    break;
                case 1792:
                    zzBL("pInkData");
                    zzYfW().zzCC("\\*\\svb");
                    zzYfW().zzXQ((byte[]) objZzVY);
                    zzYfW().zzYj3();
                    zzYfX();
                    zz2("fInkAnnotation", shapeBase.zzY9z());
                    zz2("fRenderInk", true);
                    break;
                case 1921:
                    zzJ("wzSigSetupId", (String) objZzVY);
                    break;
                case 1922:
                    zzJ("wzSigSetupProvId", (String) objZzVY);
                    break;
                case 1923:
                    zzJ("wzSigSetupSuggSigner", (String) objZzVY);
                    break;
                case 1924:
                    zzJ("wzSigSetupSuggSigner2", (String) objZzVY);
                    break;
                case 1925:
                    zzJ("wzSigSetupSuggSignerEmail", (String) objZzVY);
                    break;
                case 1926:
                    zzJ("wzSigSetupSignInst", (String) objZzVY);
                    break;
                case 1927:
                    zzJ("wzSigSetupAddlXml", (String) objZzVY);
                    break;
                case 1928:
                    zzJ("wzSigSetupProvUrl", (String) objZzVY);
                    break;
                case FieldType.FIELD_CITATION /* 1980 */:
                    zz2("fSigSetupShowSignDate", ((Boolean) objZzVY).booleanValue());
                    break;
                case 1981:
                    zz2("fSigSetupAllowComments", ((Boolean) objZzVY).booleanValue());
                    break;
                case 1982:
                    zz2("fSigSetupSignInstSet", ((Boolean) objZzVY).booleanValue());
                    break;
                case 1983:
                    zz2("fIsSignatureLine", ((Boolean) objZzVY).booleanValue());
                    break;
                case 1984:
                    zzZ1("pctHoriz", ((Integer) objZzVY).intValue());
                    break;
                case 1985:
                    zzZ1("pctVert", ((Integer) objZzVY).intValue());
                    break;
                case 1986:
                    zzZ1("pctHorizPos", ((Integer) objZzVY).intValue());
                    break;
                case 1987:
                    zzZ1("pctVertPos", ((Integer) objZzVY).intValue());
                    break;
                case 1988:
                    zzZ1("sizerelh", com.aspose.words.internal.zzZQB.zz2(objZzVY));
                    break;
                case 1989:
                    zzZ1("sizerelv", com.aspose.words.internal.zzZQB.zz2(objZzVY));
                    break;
                case 4096:
                    zzZk(((Integer) objZzVY).intValue(), shapeBase.isTopLevel());
                    break;
                case 4110:
                    zzW("fillBlip", (byte[]) objZzVY, ((Integer) zzyc3ZzYvW.zzPj(EditingLanguage.CROATIAN_BOZNIA_AND_HERZEGOVINA)).intValue());
                    break;
                case 4111:
                    zzW("lineFillBlip", (byte[]) objZzVY, ((Integer) zzyc3ZzYvW.zzPj(4121)).intValue());
                    break;
                case 4125:
                    if (!shapeBase.isGroup()) {
                        zzZ1("geoLeft", ((Integer) objZzVY).intValue());
                    }
                    break;
                case 4126:
                    if (!shapeBase.isGroup()) {
                        zzZ1("geoTop", ((Integer) objZzVY).intValue());
                    }
                    break;
                case 4127:
                    if (!shapeBase.isGroup()) {
                        zzZ1("geoRight", ((Integer) objZzVY).intValue() + shapeBase.zzZyh());
                    }
                    break;
                case 4128:
                    if (!shapeBase.isGroup()) {
                        zzZ1("geoBottom", ((Integer) objZzVY).intValue() + shapeBase.zzZyg());
                    }
                    break;
                case 4157:
                    if (!zzyc3ZzYvW.zzVE(897)) {
                        zzJ("wzDescription", ShapeBase.zzY1((String) objZzVY, shapeBase.getAlternativeText()));
                    }
                    break;
                default:
                    switch (iZzT3) {
                        case 187:
                            zz2("fSelectText", ((Boolean) objZzVY).booleanValue());
                            break;
                        case 188:
                            zz2("fAutoTextMargin", ((Boolean) objZzVY).booleanValue());
                            break;
                        case 189:
                            zz2("fRotateText", ((Boolean) objZzVY).booleanValue());
                            break;
                        case 190:
                            zz2("fFitShapeToText", ((Boolean) objZzVY).booleanValue());
                            break;
                        case 191:
                            zz2("fFitTextToShape", ((Boolean) objZzVY).booleanValue());
                            break;
                        case 192:
                            zzJ("gtextUNICODE", ((String) objZzVY).replace(IOUtils.LINE_SEPARATOR_WINDOWS, IOUtils.LINE_SEPARATOR_UNIX));
                            break;
                        case 193:
                            zz2("gtextRTF", ((Boolean) objZzVY).booleanValue());
                            break;
                        default:
                            switch (iZzT3) {
                                case 195:
                                    zzZ1("gtextSize", ((Integer) objZzVY).intValue());
                                    break;
                                case 196:
                                    zzZ1("gtextSpacing", ((Integer) objZzVY).intValue());
                                    break;
                                case 197:
                                    zzJ("gtextFont", (String) objZzVY);
                                    break;
                                default:
                                    switch (iZzT3) {
                                        case 240:
                                            zz2("gtextFReverseRows", ((Boolean) objZzVY).booleanValue());
                                            break;
                                        case 241:
                                            zz2("fGtext", ((Boolean) objZzVY).booleanValue());
                                            break;
                                        case 242:
                                            zz2("gtextFVertical", ((Boolean) objZzVY).booleanValue());
                                            break;
                                        case 243:
                                            zz2("gtextFKern", ((Boolean) objZzVY).booleanValue());
                                            break;
                                        case 244:
                                            zz2("gtextFTight", ((Boolean) objZzVY).booleanValue());
                                            break;
                                        case 245:
                                            zz2("gtextFStretch", ((Boolean) objZzVY).booleanValue());
                                            break;
                                        case 246:
                                            zz2("gtextFShrinkFit", ((Boolean) objZzVY).booleanValue());
                                            break;
                                        case StyleIdentifier.LIGHT_LIST_ACCENT_6 /* 247 */:
                                            zz2("gtextFBestFit", ((Boolean) objZzVY).booleanValue());
                                            break;
                                        case StyleIdentifier.LIGHT_GRID_ACCENT_6 /* 248 */:
                                            zz2("gtextFNormalize", ((Boolean) objZzVY).booleanValue());
                                            break;
                                        case StyleIdentifier.MEDIUM_SHADING_1_ACCENT_6 /* 249 */:
                                            zz2("gtextFDxMeasure", ((Boolean) objZzVY).booleanValue());
                                            break;
                                        case 250:
                                            zz2("gtextFBold", ((Boolean) objZzVY).booleanValue());
                                            break;
                                        case StyleIdentifier.MEDIUM_LIST_1_ACCENT_6 /* 251 */:
                                            zz2("gtextFItalic", ((Boolean) objZzVY).booleanValue());
                                            break;
                                        case StyleIdentifier.MEDIUM_LIST_2_ACCENT_6 /* 252 */:
                                            zz2("gtextFUnderline", ((Boolean) objZzVY).booleanValue());
                                            break;
                                        case StyleIdentifier.MEDIUM_GRID_1_ACCENT_6 /* 253 */:
                                            zz2("gtextFShadow", ((Boolean) objZzVY).booleanValue());
                                            break;
                                        case StyleIdentifier.MEDIUM_GRID_2_ACCENT_6 /* 254 */:
                                            zz2("gtextFSmallcaps", ((Boolean) objZzVY).booleanValue());
                                            break;
                                        case 255:
                                            zz2("gtextFStrikethrough", ((Boolean) objZzVY).booleanValue());
                                            break;
                                        case 256:
                                            zzZ1("cropFromTop", ((Integer) objZzVY).intValue());
                                            break;
                                        case 257:
                                            zzZ1("cropFromBottom", ((Integer) objZzVY).intValue());
                                            break;
                                        case StyleIdentifier.COLORFUL_LIST_ACCENT_6 /* 258 */:
                                            zzZ1("cropFromLeft", ((Integer) objZzVY).intValue());
                                            break;
                                        case StyleIdentifier.COLORFUL_GRID_ACCENT_6 /* 259 */:
                                            zzZ1("cropFromRight", ((Integer) objZzVY).intValue());
                                            break;
                                        default:
                                            switch (iZzT3) {
                                                case StyleIdentifier.INTENSE_REFERENCE /* 263 */:
                                                    zzV("pictureTransparent", (com.aspose.words.internal.zzPV) objZzVY);
                                                    break;
                                                case StyleIdentifier.BOOK_TITLE /* 264 */:
                                                    zzZ1("pictureContrast", ((Integer) objZzVY).intValue());
                                                    break;
                                                case StyleIdentifier.BIBLIOGRAPHY /* 265 */:
                                                    zzZ1("pictureBrightness", ((Integer) objZzVY).intValue());
                                                    break;
                                                case StyleIdentifier.TOC_HEADING /* 266 */:
                                                    zzZ1("pictureGamma", ((Integer) objZzVY).intValue());
                                                    break;
                                                case StyleIdentifier.PLAIN_TABLE_1 /* 267 */:
                                                    zzZ1("pictureId", ((Integer) objZzVY).intValue());
                                                    break;
                                                case StyleIdentifier.PLAIN_TABLE_2 /* 268 */:
                                                    zzV("pictureDblCrMod", (com.aspose.words.internal.zzPV) objZzVY);
                                                    break;
                                                case StyleIdentifier.PLAIN_TABLE_3 /* 269 */:
                                                    zzV("pictureFillCrMod", (com.aspose.words.internal.zzPV) objZzVY);
                                                    break;
                                                case 270:
                                                    zzV("pictureLineCrMod", (com.aspose.words.internal.zzPV) objZzVY);
                                                    break;
                                                default:
                                                    switch (iZzT3) {
                                                        case StyleIdentifier.GRID_TABLE_3_ACCENT_6 /* 317 */:
                                                            zz2("pictureGray", ((Boolean) objZzVY).booleanValue());
                                                            break;
                                                        case StyleIdentifier.GRID_TABLE_4_ACCENT_6 /* 318 */:
                                                            zz2("pictureBiLevel", ((Boolean) objZzVY).booleanValue());
                                                            break;
                                                        case StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_6 /* 319 */:
                                                            zz2("pictureActive", ((Boolean) objZzVY).booleanValue());
                                                            break;
                                                        default:
                                                            switch (iZzT3) {
                                                                case StyleIdentifier.LIST_TABLE_4 /* 325 */:
                                                                    zzZ1("shapePath", 4);
                                                                    zzZ("pVerticies", (zzYM5[]) objZzVY);
                                                                    break;
                                                                case StyleIdentifier.LIST_TABLE_5_DARK /* 326 */:
                                                                    zzZ((zzYM6[]) objZzVY);
                                                                    break;
                                                                case StyleIdentifier.LIST_TABLE_6_COLORFUL /* 327 */:
                                                                    zzZ1("adjustValue", ((Integer) objZzVY).intValue());
                                                                    break;
                                                                case StyleIdentifier.LIST_TABLE_7_COLORFUL /* 328 */:
                                                                    zzZ1("adjust2Value", ((Integer) objZzVY).intValue());
                                                                    break;
                                                                case StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_1 /* 329 */:
                                                                    zzZ1("adjust3Value", ((Integer) objZzVY).intValue());
                                                                    break;
                                                                case StyleIdentifier.LIST_TABLE_2_ACCENT_1 /* 330 */:
                                                                    zzZ1("adjust4Value", ((Integer) objZzVY).intValue());
                                                                    break;
                                                                case StyleIdentifier.LIST_TABLE_3_ACCENT_1 /* 331 */:
                                                                    zzZ1("adjust5Value", ((Integer) objZzVY).intValue());
                                                                    break;
                                                                case StyleIdentifier.LIST_TABLE_4_ACCENT_1 /* 332 */:
                                                                    zzZ1("adjust6Value", ((Integer) objZzVY).intValue());
                                                                    break;
                                                                case StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_1 /* 333 */:
                                                                    zzZ1("adjust7Value", ((Integer) objZzVY).intValue());
                                                                    break;
                                                                case StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_1 /* 334 */:
                                                                    zzZ1("adjust8Value", ((Integer) objZzVY).intValue());
                                                                    break;
                                                                case StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_1 /* 335 */:
                                                                    zzZ1("adjust9Value", ((Integer) objZzVY).intValue());
                                                                    break;
                                                                case StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_2 /* 336 */:
                                                                    zzZ1("adjust10Value", ((Integer) objZzVY).intValue());
                                                                    break;
                                                                case StyleIdentifier.LIST_TABLE_2_ACCENT_2 /* 337 */:
                                                                    zzZ("pConnectionSites", (zzYM5[]) objZzVY);
                                                                    break;
                                                                case StyleIdentifier.LIST_TABLE_3_ACCENT_2 /* 338 */:
                                                                    break;
                                                                case StyleIdentifier.LIST_TABLE_4_ACCENT_2 /* 339 */:
                                                                    zzZ1("xLimo", ((Integer) objZzVY).intValue());
                                                                    break;
                                                                case StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2 /* 340 */:
                                                                    zzZ1("yLimo", ((Integer) objZzVY).intValue());
                                                                    break;
                                                                case StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_2 /* 341 */:
                                                                    zzZ((zzZL3[]) objZzVY);
                                                                    break;
                                                                case StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_2 /* 342 */:
                                                                    zzZ((zzZLU[]) objZzVY);
                                                                    break;
                                                                case StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_3 /* 343 */:
                                                                    zzZ((zzYM4[]) objZzVY);
                                                                    break;
                                                                case StyleIdentifier.LIST_TABLE_2_ACCENT_3 /* 344 */:
                                                                    zzZ1("cxk", com.aspose.words.internal.zzZQB.zz2(objZzVY));
                                                                    break;
                                                                default:
                                                                    switch (iZzT3) {
                                                                        case StyleIdentifier.length /* 378 */:
                                                                            zz2("fShadowOK", ((Boolean) objZzVY).booleanValue());
                                                                            break;
                                                                        case 379:
                                                                            zz2("f3DOK", ((Boolean) objZzVY).booleanValue());
                                                                            break;
                                                                        case 380:
                                                                            zz2("fLineOK", ((Boolean) objZzVY).booleanValue());
                                                                            break;
                                                                        case 381:
                                                                            zz2("fGtextOK", ((Boolean) objZzVY).booleanValue());
                                                                            break;
                                                                        case 382:
                                                                            zz2("fFillShadeShapeOK", ((Boolean) objZzVY).booleanValue());
                                                                            break;
                                                                        case 383:
                                                                            zz2("fFillOK", ((Boolean) objZzVY).booleanValue());
                                                                            break;
                                                                        case 384:
                                                                            zzZ1("fillType", com.aspose.words.internal.zzZQB.zz2(objZzVY));
                                                                            break;
                                                                        case 385:
                                                                            com.aspose.words.internal.zzPV zzpv = (com.aspose.words.internal.zzPV) objZzVY;
                                                                            zzV("fillColor", zzpv);
                                                                            if (zzpv.zzPD() == 0) {
                                                                                zz2("fFilled", false);
                                                                                this.zzXse = false;
                                                                            }
                                                                            break;
                                                                        case 386:
                                                                            zzZ1("fillOpacity", ((Integer) objZzVY).intValue());
                                                                            break;
                                                                        case 387:
                                                                            zzV("fillBackColor", (com.aspose.words.internal.zzPV) objZzVY);
                                                                            break;
                                                                        case 388:
                                                                            zzZ1("fillBackOpacity", ((Integer) objZzVY).intValue());
                                                                            break;
                                                                        case 389:
                                                                            zzZ1("fillCrMod", ((Integer) objZzVY).intValue());
                                                                            break;
                                                                        default:
                                                                            switch (iZzT3) {
                                                                                case 395:
                                                                                    zzZ1("fillAngle", ((Integer) objZzVY).intValue());
                                                                                    break;
                                                                                case 396:
                                                                                    zzZ1("fillFocus", ((Integer) objZzVY).intValue());
                                                                                    break;
                                                                                case 397:
                                                                                    zzZ1("fillToLeft", ((Integer) objZzVY).intValue());
                                                                                    break;
                                                                                case 398:
                                                                                    zzZ1("fillToTop", ((Integer) objZzVY).intValue());
                                                                                    break;
                                                                                case 399:
                                                                                    zzZ1("fillToRight", ((Integer) objZzVY).intValue());
                                                                                    break;
                                                                                case 400:
                                                                                    zzZ1("fillToBottom", ((Integer) objZzVY).intValue());
                                                                                    break;
                                                                                default:
                                                                                    switch (iZzT3) {
                                                                                        case 407:
                                                                                            zzY((zzZLE[]) objZzVY);
                                                                                            break;
                                                                                        case 408:
                                                                                            zzZ1("fillOriginX", ((Integer) objZzVY).intValue());
                                                                                            break;
                                                                                        case 409:
                                                                                            zzZ1("fillOriginY", ((Integer) objZzVY).intValue());
                                                                                            break;
                                                                                        case 410:
                                                                                            zzZ1("fillShapeOriginX", ((Integer) objZzVY).intValue());
                                                                                            break;
                                                                                        case 411:
                                                                                            zzZ1("fillShapeOriginY", ((Integer) objZzVY).intValue());
                                                                                            break;
                                                                                        case 412:
                                                                                            zzZ1("fillShadeType", com.aspose.words.internal.zzZQB.zz2(objZzVY));
                                                                                            break;
                                                                                        default:
                                                                                            if (zzZD5) {
                                                                                                com.aspose.words.internal.zzZKN.format("Unhandled shape attribute: {0}", Integer.valueOf(iZzT3));
                                                                                            }
                                                                                            break;
                                                                                    }
                                                                                    break;
                                                                            }
                                                                            break;
                                                                    }
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        zznV(shapeBase.getShapeType());
        zzYZ(shapeBase);
        if (this.zzXsg) {
            zz2("fBackground", true);
        }
        if (this.zzXsf) {
            zz2("fPseudoInline", true);
        }
        zzZ1(shapeBase);
        if (shapeBase.zzY9D()) {
            zzZ0(shapeBase);
        }
    }

    public final void zzZ2(ShapeBase shapeBase) throws Exception {
        this.zzXwl.zzYfW().zzCD("\\defshp");
        this.zzXwl.zzYfW().zzZ5("\\shplid", shapeBase.getId());
        zznV(75);
        zz2("fFlipH", false);
        zz2("fFlipV", false);
        zz2("fLockRotation", true);
        zz2("fLockPosition", true);
        zz2("fLayoutInCell", true);
        zz2("fPseudoInline", true);
    }

    public final void zzZ3(ShapeBase shapeBase) throws Exception {
        this.zzXsg = true;
        zzW(shapeBase, false);
        this.zzXsg = false;
    }

    private void zzV(ShapeBase shapeBase, boolean z) throws Exception {
        this.zzXwl.zzYfW().zzZ5("\\shplid", shapeBase.getId());
        boolean z2 = shapeBase.isInline() && !shapeBase.zzY9F();
        if (this.zzXsg || (shapeBase.isTopLevel() && !z2)) {
            zzZT3 zzzt3Zzg = zzZT3.zzg(shapeBase);
            this.zzXwl.zzYfW().zzZ5("\\shpleft", com.aspose.words.internal.zzSA.zzr(zzzt3Zzg.zzYJG));
            this.zzXwl.zzYfW().zzZ5("\\shpright", com.aspose.words.internal.zzSA.zzr(zzzt3Zzg.zzYJG + zzzt3Zzg.zzYJE));
            this.zzXwl.zzYfW().zzZ5("\\shptop", com.aspose.words.internal.zzSA.zzr(zzzt3Zzg.zzYJF));
            this.zzXwl.zzYfW().zzZ5("\\shpbottom", com.aspose.words.internal.zzSA.zzr(zzzt3Zzg.zzYJF + zzzt3Zzg.zzYJD));
            this.zzXwl.zzYfW().zzY7("\\shpfhdr", z ? "1" : "0");
            this.zzXwl.zzYfW().zzZ5("\\shpz", this.zzXwl.zzZqS().zzYL(shapeBase));
            this.zzXwl.zzYfW().zzY7("\\shpfblwtxt", shapeBase.getBehindText() ? "1" : "0");
            this.zzXwl.zzYfW().zzCD(zzYFG.zzox(shapeBase.getRelativeHorizontalPosition()));
            this.zzXwl.zzYfW().zzCD("\\shpbxignore");
            this.zzXwl.zzYfW().zzCD(zzYFG.zzow(shapeBase.getRelativeVerticalPosition()));
            this.zzXwl.zzYfW().zzCD("\\shpbyignore");
            this.zzXwl.zzYfW().zzZ5("\\shpwr", shapeBase.getWrapType() == 0 ? 3 : shapeBase.getWrapType());
            this.zzXwl.zzYfW().zzZ5("\\shpwrk", shapeBase.getWrapSide());
            this.zzXwl.zzYfW().zz7("\\shplockanchor", shapeBase.getAnchorLocked());
        }
        if (shapeBase.isTopLevel()) {
            zz2("fLayoutInCell", shapeBase.isLayoutInCell());
        }
    }

    private void zzZ(zzZL3[] zzzl3Arr) throws Exception {
        zzBL("pAdjustHandles");
        zzVW(zzzl3Arr.length, 36);
        for (zzZL3 zzzl3 : zzzl3Arr) {
            this.zzXwl.zzYfW().zzp5(zzzl3.getFlags());
            this.zzXwl.zzYfW().zzp5(zzzl3.zzYu1.zzZ51());
            this.zzXwl.zzYfW().zzp5(zzzl3.zzYu0.zzZ51());
            this.zzXwl.zzYfW().zzp5(zzzl3.zzYtZ.getValue());
            this.zzXwl.zzYfW().zzp5(zzzl3.zzYtY.getValue());
            this.zzXwl.zzYfW().zzp5(zzzl3.zzYtX.getValue());
            this.zzXwl.zzYfW().zzp5(zzzl3.zzYtW.getValue());
            this.zzXwl.zzYfW().zzp5(zzzl3.zzYtV.getValue());
            this.zzXwl.zzYfW().zzp5(zzzl3.zzYtU.getValue());
        }
        zzYfX();
    }

    private void zzZ1(String str, int i) throws Exception {
        zzJ(str, Integer.toString(i));
    }

    private void zzZ(zzZLU[] zzzluArr) throws Exception {
        zzBL("pGuides");
        zzVX(zzzluArr.length, 8);
        for (int i = 0; i < zzzluArr.length; i++) {
            zzZLU zzzlu = zzzluArr[i];
            int i2 = (((byte) zzzlu.zzYvt) & 255) | (zzzlu.zzZjA << 8) | (zzzlu.zzYvs << 16);
            int i3 = (zzzlu.zzYvq << 16) | zzzlu.zzYvr;
            boolean z = true;
            if (i != zzzluArr.length - 1) {
                z = false;
            }
            zzH(i2, i3, z);
        }
        zzYfX();
    }

    private void zzZ(zzYM4[] zzym4Arr) throws Exception {
        if (zzym4Arr.length == 0) {
            return;
        }
        if (zzym4Arr.length == 1 && zzym4Arr[0].zzZ(zzYM4.zzXFf)) {
            return;
        }
        zzBL("pInscribe");
        zzVW(zzym4Arr.length, 16);
        for (zzYM4 zzym4 : zzym4Arr) {
            this.zzXwl.zzYfW().zzp5(zzZU1.zzZ(zzym4.zzXFj));
            this.zzXwl.zzYfW().zzp5(zzZU1.zzZ(zzym4.zzXFi));
            this.zzXwl.zzYfW().zzp5(zzZU1.zzZ(zzym4.zzXFh));
            this.zzXwl.zzYfW().zzp5(zzZU1.zzZ(zzym4.zzXFg));
        }
        zzYfX();
    }

    private void zzZ(zzJW[] zzjwArr) throws Exception {
        zzBL("pRelationTbl");
        zzVW(zzjwArr.length, 12);
        for (zzJW zzjw : zzjwArr) {
            this.zzXwl.zzYfW().zzp5(zzjw.zzZj2);
            this.zzXwl.zzYfW().zzp5(zzjw.zzZj1);
            this.zzXwl.zzYfW().zzp5(zzjw.zzZj0);
        }
        zzYfX();
    }

    private void zzZ(zzYM6[] zzym6Arr) throws Exception {
        zzBL("pSegmentInfo");
        zzVX(zzym6Arr.length, 2);
        for (int i = 0; i < zzym6Arr.length; i++) {
            this.zzXwl.zzYfW().write(zzZTF.zzZ(zzym6Arr[i]));
            if (i != zzym6Arr.length - 1) {
                this.zzXwl.zzYfW().zzYj7();
                this.zzXwl.zzYfW().zzYj8();
            }
        }
        zzYfX();
    }

    private void zzW(String str, byte[] bArr, int i) throws Exception {
        zzBL(str);
        new zzYFX(this.zzXwl, bArr).zzX(true, false, i);
        zzYfX();
    }

    private void zzW(String str, int[] iArr) throws Exception {
        zzBL(str);
        zzVX(iArr.length, 4);
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            boolean z = true;
            if (i != iArr.length - 1) {
                z = false;
            }
            zzZj(i2, z);
        }
        zzYfX();
    }
}
