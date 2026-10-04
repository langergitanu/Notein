package com.aspose.words.internal;

import androidx.core.view.InputDeviceCompat;
import com.aspose.words.EditingLanguage;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: loaded from: classes5.dex */
final class zz9D {
    public static String zzUQ(int i) {
        switch (i) {
            case 1:
                return "R2_BLACK";
            case 2:
                return "R2_NOTMERGEPEN";
            case 3:
                return "R2_MASKNOTPEN";
            case 4:
                return "R2_NOTCOPYPEN";
            case 5:
                return "R2_MASKPENNOT";
            case 6:
                return "R2_NOT";
            case 7:
                return "R2_XORPEN";
            case 8:
                return "R2_NOTMASKPEN";
            case 9:
                return "R2_MASKPEN";
            case 10:
                return "R2_NOTXORPEN";
            case 11:
                return "R2_NOP";
            case 12:
                return "R2_MERGENOTPEN";
            case 13:
                return "R2_COPYPEN";
            case 14:
                return "R2_MERGEPENNOT";
            case 15:
                return "R2_MERGEPEN";
            case 16:
                return "R2_WHITE";
            default:
                return zzZKN.format("{0}", Integer.valueOf(i));
        }
    }

    public static String zzUR(int i) {
        switch (i) {
            case Integer.MIN_VALUE:
                return "NoMirrorBitmap";
            case 66:
                return "Blackness";
            case 1114278:
                return "NotSrcErase";
            case 3342344:
                return "NotSrcCopy";
            case 4457256:
                return "SrcErase";
            case 5570569:
                return "DstInvert";
            case 5898313:
                return "PatInvert";
            case 6684742:
                return "SrcInvert";
            case 8913094:
                return "SrcAnd";
            case 11141161:
                return "D";
            case 12255782:
                return "MergePaint";
            case 12583114:
                return "MergeCopy";
            case 13369376:
                return "SrcCopy";
            case 15597702:
                return "SrcPaint";
            case 15728673:
                return "PatCopy";
            case 16452105:
                return "PatPaint";
            case 16711778:
                return "Whiteness";
            case 1073741824:
                return "CaptureBlt";
            default:
                return zzZKN.format("{0}", Integer.valueOf(i));
        }
    }

    public static String zzUS(int i) {
        if (i == 0) {
            return "None";
        }
        if (i == 531) {
            return "WmfLineTo";
        }
        if (i == 532) {
            return "WmfMoveTo";
        }
        if (i == 804) {
            return "WmfPolygon";
        }
        if (i == 805) {
            return "WmfPolyline";
        }
        if (i == 1045) {
            return "WmfExcludeClipRect";
        }
        if (i == 1046) {
            return "WmfIntersectClipRect";
        }
        if (i == 1048) {
            return "WmfEllipse";
        }
        if (i == 1049) {
            return "WmfFloodFill";
        }
        if (i == 1564) {
            return "WmfRoundRect";
        }
        if (i == 1565) {
            return "WmfPATBLT";
        }
        switch (i) {
            case 0:
                return "None";
            case 30:
                return "WmfSaveDC";
            case 53:
                return "WmfRealizePalette";
            case 55:
                return "WmfSetPalEntries";
            case StyleIdentifier.LIGHT_LIST_ACCENT_6 /* 247 */:
                return "WmfCreatePalette";
            case StyleIdentifier.GRID_TABLE_2_ACCENT_3 /* 295 */:
                return "WmfRestoreDC";
            case StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_5 /* 313 */:
                return "WmfResizePalette";
            case StyleIdentifier.LIST_TABLE_1_LIGHT /* 322 */:
                return "WmfDibCreatePatternBrush";
            case StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_1 /* 329 */:
                return "WmfSETLAYOUT";
            case 496:
                return "WmfDeleteObject";
            case 505:
                return "WmfCreatePatternBrush";
            case InputDeviceCompat.SOURCE_DPAD /* 513 */:
                return "WmfSetBkColor";
            case 529:
                return "WmfOffsetViewportOrg";
            case 544:
                return "WmfOffsetClipRgn";
            case 552:
                return "WmfFillRegion";
            case 561:
                return "WmfSetMapperFlags";
            case 564:
                return "WmfSelectPalette";
            case EditingLanguage.ITALIAN_ITALY /* 1040 */:
                return "WmfScaleWindowExt";
            case EditingLanguage.KOREAN /* 1042 */:
                return "WmfScaleViewportExt";
            case 1051:
                return "WmfRectangle";
            case 1055:
                return "WmfSetPixel";
            case EditingLanguage.PERSIAN /* 1065 */:
                return "WmfFrameRegion";
            case EditingLanguage.AFRIKAANS /* 1078 */:
                return "WmfAnimatePalette";
            case 1313:
                return "WmfTextOut";
            case 1336:
                return "WmfPolyPolygon";
            case 1352:
                return "WmfExtFloodFill";
            case 1574:
                return "WmfEscape";
            case 1791:
                return "WmfCreateRegion";
            case 2071:
                return "WmfArc";
            case EditingLanguage.SERBIAN_LATIN_SERBIA_AND_MONTENEGRO /* 2074 */:
                return "WmfPie";
            case 2096:
                return "WmfChord";
            case 2338:
                return "WmfBITBLT";
            case 2368:
                return "WmfDibBitBlt";
            case 2610:
                return "WmfExtTextOut";
            case 2851:
                return "WmfSTRETCHBLT";
            case 2881:
                return "WmfDibStretchBlt";
            case 3379:
                return "WmfSetDibToDev";
            case 3907:
                return "WmfStretchDib";
            default:
                switch (i) {
                    case StyleIdentifier.COLORFUL_LIST_ACCENT_6 /* 258 */:
                        return "WmfSetBkMode";
                    case StyleIdentifier.COLORFUL_GRID_ACCENT_6 /* 259 */:
                        return "WmfSetMapMode";
                    case StyleIdentifier.SUBTLE_EMPHASIS /* 260 */:
                        return "WmfSETROP2";
                    case StyleIdentifier.INTENSE_EMPHASIS /* 261 */:
                        return "WmfSETRELABS";
                    case StyleIdentifier.SUBTLE_REFERENCE /* 262 */:
                        return "WmfSetPolyFillMode";
                    case StyleIdentifier.INTENSE_REFERENCE /* 263 */:
                        return "WmfSetStretchBltMode";
                    case StyleIdentifier.BOOK_TITLE /* 264 */:
                        return "WmfSetTextCharExtra";
                    default:
                        switch (i) {
                            case StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_3 /* 298 */:
                                return "WmfInvertRegion";
                            case StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_3 /* 299 */:
                                return "WmfPaintRegion";
                            case 300:
                                return "WmfSelectClipRegion";
                            case 301:
                                return "WmfSelectObject";
                            case 302:
                                return "WmfSetTextAlign";
                            default:
                                switch (i) {
                                    case 521:
                                        return "WmfSetTextColor";
                                    case 522:
                                        return "WmfSetTextJustification";
                                    case 523:
                                        return "WmfSetWindowOrg";
                                    case 524:
                                        return "WmfSetWindowExt";
                                    case 525:
                                        return "WmfSetViewportOrg";
                                    case 526:
                                        return "WmfSetViewportExt";
                                    case 527:
                                        return "WmfOffsetWindowOrg";
                                    default:
                                        switch (i) {
                                            case 762:
                                                return "WmfCreatePenIndirect";
                                            case 763:
                                                return "WmfCreateFontIndirect";
                                            case 764:
                                                return "WmfCreateBrushIndirect";
                                            default:
                                                return "";
                                        }
                                }
                        }
                }
        }
    }

    public static String zzUT(int i) {
        switch (i) {
            case 0:
                return "None";
            case 1:
                return "EmfHeader";
            case 2:
                return "EmfPolyBezier";
            case 3:
                return "EmfPolygon";
            case 4:
                return "EmfPolyline";
            case 5:
                return "EmfPolyBezierTo";
            case 6:
                return "EmfPolylineTo";
            case 7:
                return "EmfPolyPolyline";
            case 8:
                return "EmfPolyPolygon";
            case 9:
                return "EmfSetWindowExtEx";
            case 10:
                return "EmfSetWindowOrgEx";
            case 11:
                return "EmfSetViewportExtEx";
            case 12:
                return "EmfSetViewportOrgEx";
            case 13:
                return "EmfSetBrushOrgEx";
            case 14:
                return "EmfEOF";
            case 15:
                return "EmfSetPixelV";
            case 16:
                return "EmfSetMapperFlags";
            case 17:
                return "EmfSetMapMode";
            case 18:
                return "EmfSetBkMode";
            case 19:
                return "EmfSetPolyFillMode";
            case 20:
                return "EmfSetROP2";
            case 21:
                return "EmfSetStretchBltMode";
            case 22:
                return "EmfSetTextAlign";
            case 23:
                return "EmfSetColorAdjustment";
            case 24:
                return "EmfSetTextColor";
            case 25:
                return "EmfSetBkColor";
            case 26:
                return "EmfOffsetClipRgn";
            case 27:
                return "EmfMoveToEx";
            case 28:
                return "EmfSetMetaRgn";
            case 29:
                return "EmfExcludeClipRect";
            case 30:
                return "EmfIntersectClipRect";
            case 31:
                return "EmfScaleViewportExtEx";
            case 32:
                return "EmfScaleWindowExtEx";
            case 33:
                return "EmfSaveDC";
            case 34:
                return "EmfRestoreDC";
            case 35:
                return "EmfSetWorldTransform";
            case 36:
                return "EmfModifyWorldTransform";
            case 37:
                return "EmfSelectObject";
            case 38:
                return "EmfCreatePen";
            case 39:
                return "EmfCreateBrushIndirect";
            case 40:
                return "EmfDeleteObject";
            case 41:
                return "EmfAngleArc";
            case 42:
                return "EmfEllipse";
            case 43:
                return "EmfRectangle";
            case 44:
                return "EmfRoundRect";
            case 45:
                return "EmfArc";
            case 46:
                return "EmfChord";
            case 47:
                return "EmfPie";
            case 48:
                return "EmfSelectPalette";
            case 49:
                return "EmfCreatePalette";
            case 50:
                return "EmfSetPaletteEntries";
            case 51:
                return "EmfResizePalette";
            case 52:
                return "EmfRealizePalette";
            case 53:
                return "EmfExtFloodFill";
            case 54:
                return "EmfLineTo";
            case 55:
                return "EmfArcTo";
            case 56:
                return "EmfPolyDraw";
            case 57:
                return "EmfSetArcDirection";
            case 58:
                return "EmfSetMiterLimit";
            case 59:
                return "EmfBeginPath";
            case 60:
                return "EmfEndPath";
            case 61:
                return "EmfCloseFigure";
            case 62:
                return "EmfFillPath";
            case 63:
                return "EmfStrokeAndFillPath";
            case 64:
                return "EmfStrokePath";
            case 65:
                return "EmfFlattenPath";
            case 66:
                return "EmfWidenPath";
            case 67:
                return "EmfSelectClipPath";
            case 68:
                return "EmfAbortPath";
            case 69:
                return "EmfReserved_069";
            case 70:
                return "EmfGdiComment";
            case 71:
                return "EmfFillRgn";
            case 72:
                return "EmfFrameRgn";
            case 73:
                return "EmfInvertRgn";
            case 74:
                return "EmfPaintRgn";
            case 75:
                return "EmfExtSelectClipRgn";
            case 76:
                return "EmfBitBlt";
            case 77:
                return "EmfStretchBlt";
            case 78:
                return "EmfMaskBlt";
            case 79:
                return "EmfPlgBlt";
            case 80:
                return "EmfSetDIBitsToDevice";
            case 81:
                return "EmfStretchDIBits";
            case 82:
                return "EmfExtCreateFontIndirect";
            case 83:
                return "EmfExtTextOutA";
            case 84:
                return "EmfExtTextOutW";
            case 85:
                return "EmfPolyBezier16";
            case 86:
                return "EmfPolygon16";
            case 87:
                return "EmfPolyline16";
            case 88:
                return "EmfPolyBezierTo16";
            case 89:
                return "EmfPolylineTo16";
            case 90:
                return "EmfPolyPolyline16";
            case 91:
                return "EmfPolyPolygon16";
            case 92:
                return "EmfPolyDraw16";
            case 93:
                return "EmfCreateMonoBrush";
            case 94:
                return "EmfCreateDIBPatternBrushPt";
            case 95:
                return "EmfExtCreatePen";
            case 96:
                return "EmfPolyTextOutA";
            case 97:
                return "EmfPolyTextOutW";
            case 98:
                return "EmfSetICMMode";
            case 99:
                return "EmfCreateColorSpace";
            case 100:
                return "EmfSetColorSpace";
            case 101:
                return "EmfDeleteColorSpace";
            case 102:
                return "EmfGLSRecord";
            case 103:
                return "EmfGLSBoundedRecord";
            case 104:
                return "EmfPixelFormat";
            case 105:
                return "EmfDrawEscape";
            case 106:
                return "EmfExtEscape";
            case 107:
                return "EmfStartDoc";
            case 108:
                return "EmfSmallTextOut";
            case 109:
                return "EmfForceUFIMapping";
            case 110:
                return "EmfNamedEscape";
            case 111:
                return "EmfColorCorrectPalette";
            case 112:
                return "EmfSetICMProfileA";
            case 113:
                return "EmfSetICMProfileW";
            case 114:
                return "EmfAlphaBlend";
            case 115:
                return "EmfSetLayout";
            case 116:
                return "EmfTransparentBlt";
            case 117:
                return "EmfReserved_117";
            case 118:
                return "EmfGradientFill";
            case 119:
                return "EmfSetLinkedUFIs";
            case 120:
                return "EmfSetTextJustification";
            case 121:
                return "EmfColorMatchToTargetW";
            case 122:
                return "EmfCreateColorSpaceW";
            default:
                return "";
        }
    }
}
