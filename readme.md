<h2>Despawning Eggs Hatch</h2>
<p><a href="https://github.com/Serilum/Despawning-Eggs-Hatch"><img src="https://serilum.com/assets/data/logo/despawning-eggs-hatch.png"></a></p><h2>Download</h2>
<p>You can download Despawning Eggs Hatch on CurseForge and Modrinth:</p><p>&nbsp;&nbsp;CurseForge: &nbsp;&nbsp;<a href="https://curseforge.com/minecraft/mc-mods/despawning-eggs-hatch">https://curseforge.com/minecraft/mc-mods/despawning-eggs-hatch</a><br>&nbsp;&nbsp;Modrinth: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="https://modrinth.com/mod/despawning-eggs-hatch">https://modrinth.com/mod/despawning-eggs-hatch</a></p>
<h2>Issue Tracker</h2>
<p>To keep a better overview of all mods, the issue tracker is located in a separate repository.<br>&nbsp;&nbsp;For issues, ideas, suggestions or anything else, please follow this link:</p>
<p>&nbsp;&nbsp;&nbsp;&nbsp;-> <a href="https://serilum.com/url/issue-tracker">Issue Tracker</a></p>
<h2>Pull Requests</h2>
<p>Because of the way mod loader files are bundled into one jar, some extra information is needed to do a PR.<br>&nbsp;&nbsp;A wiki page entry about it is available here:</p>
<p>&nbsp;&nbsp;&nbsp;&nbsp;-> <a href="https://serilum.com/url/pull-requests">Pull Request Information</a></p>
<h2>Mod Description</h2>
<p><a href="https://serilum.com/" rel="nofollow"><img src="https://github.com/Serilum/.cdn/blob/main/description/header/header.png" alt="" width="838" height="400"></a><br><br><a href="https://legacy.curseforge.com/minecraft/mc-mods/despawning-eggs-hatch/files"><img src="https://github.com/Serilum/.cdn/raw/main/description/versions/header.png"></a><a href="https://legacy.curseforge.com/minecraft/mc-mods/despawning-eggs-hatch/files/all?filter-status=1&filter-game-version=1738749986:75125" rel="nofollow"><img src="https://github.com/Serilum/.cdn/raw/main/description/versions/1_20.png"></a><a href="https://legacy.curseforge.com/minecraft/mc-mods/despawning-eggs-hatch/files/all?filter-status=1&filter-game-version=1738749986:73407" rel="nofollow"><img src="https://github.com/Serilum/.cdn/raw/main/description/versions/1_19.png"></a><a href="https://legacy.curseforge.com/minecraft/mc-mods/despawning-eggs-hatch/files/all?filter-status=1&filter-game-version=1738749986:73250" rel="nofollow"><img src="https://github.com/Serilum/.cdn/raw/main/description/versions/1_18.png"></a><a href="https://legacy.curseforge.com/minecraft/mc-mods/despawning-eggs-hatch/files/all?filter-status=1&filter-game-version=1738749986:73242" rel="nofollow"><img src="https://github.com/Serilum/.cdn/raw/main/description/versions/1_17.png"></a><a href="https://legacy.curseforge.com/minecraft/mc-mods/despawning-eggs-hatch/files/all?filter-status=1&filter-game-version=1738749986:70886" rel="nofollow"><img src="https://github.com/Serilum/.cdn/raw/main/description/versions/1_16.png"></a><a href="https://legacy.curseforge.com/minecraft/mc-mods/despawning-eggs-hatch/files/all?filter-status=1&filter-game-version=1738749986:68722" rel="nofollow"><img src="https://github.com/Serilum/.cdn/raw/main/description/versions/1_15.png"></a><a href="https://legacy.curseforge.com/minecraft/mc-mods/despawning-eggs-hatch/files/all?filter-status=1&filter-game-version=1738749986:64806" rel="nofollow"><img src="https://github.com/Serilum/.cdn/raw/main/description/versions/1_14.png"></a><a href="https://legacy.curseforge.com/minecraft/mc-mods/despawning-eggs-hatch/files/all?filter-status=1&filter-game-version=1738749986:55023" rel="nofollow"><img src="https://github.com/Serilum/.cdn/raw/main/description/versions/1_13.png"></a><a href="https://legacy.curseforge.com/minecraft/mc-mods/despawning-eggs-hatch/files/all?filter-status=1&filter-game-version=1738749986:628" rel="nofollow"><img src="https://github.com/Serilum/.cdn/raw/main/description/versions/1_12.png"></a><br><br><strong><span style="font-size:24px">Requires the library mod&nbsp;<a style="font-size:24px" href="https://www.curseforge.com/minecraft/mc-mods/collective" rel="nofollow">Collective</a>.</span></strong><strong>&nbsp;<br><br> &nbsp; &nbsp;This mod is part of <span style="color:#008000"><a style="color:#008000" href="https://curseforge.com/minecraft/modpacks/the-vanilla-experience" rel="nofollow">The Vanilla Experience</a></span>.</strong><br><span style="font-size:18px">Despawning Eggs Hatch is a minimalistic configurable mod which allows chicken eggs on the ground to hatch just before they despawn. New spawns will be limited to 50 by default, in order to prevent infinite chicken spawns. Items (and eggs) despawn after 6000 ticks, 5 minutes. By default a chicken will only spawn when the egg despawns when on top of a hay block. This prevents groups of wild chicken groups in loaded chunks from getting too big.</span><br><br><br><strong><span style="font-size:20px">Configurable:</span> <span style="color:#008000;font-size:14px"><a style="color:#008000" href="https://serilum.com/url/issue-trackerwiki/how-to-configure-mods" rel="nofollow">(&nbsp;how do I configure?&nbsp;)</a></span><br></strong><strong>eggOnlyHatchesWhenOnTopOfHayBlock</strong>&nbsp;(default = true): When enabled, an egg will only hatch when it is laid on top a hay block. This prevents wild chicken colonies from expanding without your knowledge.<br><strong>eggWillHatchChance</strong>&nbsp;(default = 1.0, min 0, max 1.0): The chance an egg will hatch just before despawning if the entity limiter is not active.<br><strong>onlyHatchIfLessChickensAroundThan</strong>&nbsp;(default = 50, min 0, max 1000): Prevents too many entities from hatching. A despawning egg will only hatch if there are less chickens than defined here in a radius of 'radiusEntityLimiterCheck' blocks around.<br><strong>radiusEntityLimiterCheck</strong>&nbsp;(default = 32, min 1, max 256): The radius around the despawned egg for 'onlyHatchIfLessChickensAroundThan'.<br><strong>newHatchlingIsBaby</strong>&nbsp;(default = true): If enabled, the newly hatched chicken is a small chick.<br><br><br><span style="font-size:18px"><strong>A GIF showing the egg hatching (with the despawn timer set to 1 second for the example):</strong></span></p>
<div class="spoiler">
<p><picture><img src="https://github.com/Serilum/.cdn/raw/main/projects/despawning-eggs-hatch/c.gif"></picture></p>
</div>
<p><br>------------------<br><br><span style="font-size:24px"><strong>You may freely use this mod in any modpack, as long as the download remains hosted within the CurseForge or Modrinth ecosystem.</strong></span><br><br><span style="font-size:18px"><a style="font-size:18px;color:#008000" href="https://serilum.com/" rel="nofollow">Serilum.com</a> contains an overview and more information on all mods available.</span><br><br><span style="font-size:14px">Comments are disabled as I'm unable to keep track of all the separate pages on each mod.</span><span style="font-size:14px"><br>For issues, ideas, suggestions or anything else there is the&nbsp;<a style="font-size:14px;color:#008000" href="https://serilum.com/url/issue-tracker" rel="nofollow">Github repo</a>. Thanks!</span><span style="font-size:6px"><br><br></span><a href="https://ricksouth.com/donate" rel="nofollow"><img src="https://github.com/Serilum/.cdn/raw/main/description/shields/donation_rounded.svg" alt="" width="306" height="50"></a></p>