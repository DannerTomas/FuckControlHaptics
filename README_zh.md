# FuckControlHaptics

干掉了 ColorOS 15 控制中心调节音量或亮度时的震动。

## 要求

*   运行 ColorOS 15（其他版本未经测试）
*   已安装 LSPosed

## 安装指南

1.  安装本模块的 APK 文件
2.  在 LSPosed 中启用本模块
3.  作用域选择"系统界面"（com.android.systemui）
4.  重启您的设备或SystemUI

## 技术细节

该模块Hook了 `View.performHapticFeedback()` 方法，并特别屏蔽了 ColorOS 15 用于控制中心滑块交互的触感反馈常量 `305`。

## 免责声明

本模块为学习目的而开发。使用风险自负。开发者对使用此模块引起的任何问题不承担责任。

## 许可证

开源 - 可以自由修改和分发。