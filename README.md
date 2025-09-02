# MythBoard
This repository is for the MythBoard API.<br>
You can also find the general [MythBoard wiki](../../wiki) here!

Join our [Discord](https://discord.gg/DF833eDanm) for more support!<br>
[![demo](https://img.shields.io/discord/686041145218039861?logo=discord)](https://discord.gg/DF833eDanm)

### About
MythBoard is a scoreboard plugin supporting versions 1.17+<br>
This plugin is only possible thanks to the [Megavex Network Scoreboard Library](https://github.com/MegavexNetwork/scoreboard-library/).<br>
This plugin is also inspired heavily from [KiteBoard](https://www.spigotmc.org/resources/kiteboard.13694/).

### Version Compatibility

| Version      | Supported                                                       |
|--------------|-----------------------------------------------------------------|
| 1.8 -> 1.12  | No                                                              |
| 1.13 -> 1.16 | With [Packet Events](https://github.com/retrooper/packetevents) |
| 1.17+        | Yes                                                             |

# Adding to your project
To add this API to your project, simply add through gradle or maven.

Replace `{version}` with the latest release:<br>
[![Release](https://jitpack.io/v/DeOpping/MythBoardAPI.svg)](https://jitpack.io/#DeOpping/MythBoardAPI)

<details><summary>Gradle</summary>

```gradle
repositories {
    maven { url = 'https://jitpack.io' }
}

dependencies {
    compileOnly 'com.github.DeOpping:MythBoardAPI:{version}'
}
```
</details>
<details><summary>Maven</summary>

```xml
<repositories>
    <id>jitpack</id>
    <name>JitPack</name>
    <url>https://jitpack.io</url>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.github.DeOpping</groupId>
        <artifactId>MythBoardAPI</artifactId>
        <version>{version}</version>
        <scope>provided</scope>
    </dependency>
</dependencies>
```
</details>

Read more about how to use the API on our [wiki](../../wiki)!

# License
This API is licensed under the [MIT license](./LICENSE).