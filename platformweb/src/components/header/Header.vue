<template>
	<div>
		<div class="line"></div>
		<el-menu :default-active="activeIndex2" class="el-menu-demo" mode="horizontal" @select="handleSelect" background-color="#545c64" text-color="#fff" active-text-color="#ffd04b">
			<el-menu-item index="1">接口自动化测试平台</el-menu-item>
			<el-menu-item index="task">任务列表</el-menu-item>
			<el-menu-item index="case">Case管理</el-menu-item>
			<el-menu-item index="report">测试报告</el-menu-item>
			<el-menu-item index="await" @click="dialogVisible = true">敬请期待新功能</el-menu-item>
		</el-menu>
		<el-dialog title="友情提示" :visible.sync="dialogVisible" width="30%" :before-close="handleClose">
			<span>紧密开发中，敬请期待！</span>
			<span slot="footer" class="dialog-footer">
              <el-button type="primary" @click="dialogVisible = false">确 定</el-button>
            </span>
		</el-dialog>
	</div>
</template>

<script>
	export default {
		data() {
			return {
				activeIndex: '1',
				activeIndex2: '1',
				dialogVisible: false
			};
		},
		methods: {
			handleClose() {

			},
			handleSelect(key, keyPath) {
				console.log(key, keyPath);
				if(keyPath == "task") {
					this.getTaskList();
				} else if(keyPath == "case") {
					this.getCaseList();
				} else if(keyPath == "1") {
					this.toIndex();
				} else if(keyPath == "report") {
					this.getReportList();
				}

			},
			toIndex() {
				this.$router.push({
					path: '/',
				});
			},
			getTaskList() {
				this.$router.push({
					path: '/TaskList',
				});
			},
			getCaseList() {
				this.$router.push({
					path: '/CaseList'
				});
			},
			getReportList() {
				this.$router.push({
					path: '/ReportList'
				});
			}
		}
	}
</script>
<style>

</style>