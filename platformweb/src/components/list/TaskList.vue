<template>
	<!--vue中，在template的模板中要求，最高的父类标签只能有一个，所以最好加上一个div，这样下边就可以随意写了-->
	<div>
		<br />
		<table>
			<tr>
				<td>
					<el-input v-model="input" placeholder="请输入内容"></el-input>
				</td>
				<td>
					<el-button type="primary" icon="el-icon-search">搜索</el-button>
				</td>
			</tr>

		</table>
		<div>
			<el-button type="primary" icon="el-icon-circle-plus-outline" @click="dialogFormVisible = true" style="margin-left: 87%;">创建任务</el-button>
			<el-dialog title="收货地址" :visible.sync="dialogFormVisible">
				<el-form :model="form">
					<el-form-item label="活动名称" :label-width="formLabelWidth">
						<el-input v-model="form.name" auto-complete="off"></el-input>
					</el-form-item>
					<el-form-item label="活动区域" :label-width="formLabelWidth">
						<el-select v-model="form.region" placeholder="请选择活动区域">
							<el-option label="区域一" value="shanghai"></el-option>
							<el-option label="区域二" value="beijing"></el-option>
						</el-select>
					</el-form-item>
				</el-form>
				<div slot="footer" class="dialog-footer">
					<el-button @click="dialogFormVisible = false">取 消</el-button>
					<el-button type="primary" @click="dialogFormVisible = false">确 定</el-button>
				</div>
			</el-dialog>
		</div>

		<br />
		<el-table :data="tableData" border style="width: 100%">
			<el-table-column fixed prop="taskID" label="ID">
			</el-table-column>
			<el-table-column fixed prop="taskName" label="任务名称">

				<!--width="150" 去掉宽度，原因是去掉后就会变成自适应宽度-->

			</el-table-column>
			<el-table-column prop="taskStatus" label="任务状态">
			</el-table-column>
			<el-table-column prop="taskCreateTime" label="任务创建时间">
			</el-table-column>
			<el-table-column prop="taskDescription" label="任务描述">
			</el-table-column>
			<el-table-column fixed="right" label="操作">
				<template slot-scope="scope">
					<el-button @click="handleClick(scope.row)" type="text" size="small">查看</el-button>
					<el-button type="text" size="small">编辑</el-button>
				</template>
			</el-table-column>
		</el-table>
		<br />
		<el-pagination background layout="prev, pager, next" :total="1000">
		</el-pagination>

	</div>
</template>

<script>
	export default {
		methods: {
			handleClick(row) {
				console.log(row);
			}
		},

		data() {
			return {
				tableData: [{
					taskID: '2016-05-03',
					taskName: '王小虎',
					taskStatus: '上海'
				}, {
					taskID: '2016-05-03',
					taskName: '王小虎',
					taskStatus: '上海'
				}, {
					taskID: '2016-05-03',
					taskName: '王小虎',
					taskStatus: '上海'
				}],
				dialogTableVisible: false,
				dialogFormVisible: false,
				form: {
					name: '',
					region: '',
					date1: '',
					date2: '',
					delivery: false,
					type: [],
					resource: '',
					desc: ''
				},
				formLabelWidth: '120px'
			}
		}
	}
</script>
<style>

</style>